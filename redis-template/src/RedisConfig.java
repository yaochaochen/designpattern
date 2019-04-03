
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.MapPropertySource;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName RedisConfig
 * @Author yaochaochen
 * @Date 2019-04-03 16:47
 **/

@Configuration
@EnableCaching 
public class RedisConfig extends CachingConfigurerSupport { 
        @Value("${spring.redis.cluster.nodes}") 
        private String clusterNodes;
        @Value("${spring.redis.cluster.timeout}") 
        private Long timeout;
        @Value("${spring.redis.cluster.max-redirects}") 
        private int redirects;
        @Value("${redis.maxIdle}") 
        private int maxIdle;
        @Value("${redis.maxTotal}") 
        private int maxTotal;
        @Value("${redis.maxWaitMillis}") 
        private long maxWaitMillis;
        @Value("${redis.testOnBorrow}")
        private boolean testOnBorrow;
        /**
    * 选择redis作为默认缓存工具
    * @param redisTemplate
    * @return
    */
        @Bean 
        public CacheManager cacheManager(RedisTemplate redisTemplate) { 
                RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
       
                return cacheManager; 
        }


@Bean
 public RedisClusterConfiguration redisClusterConfiguration() {
     Map<String, Object> source = new HashMap<>();
     source.put("spring.redis.cluster.nodes", clusterNodes);
     source.put("spring.redis.cluster.timeout", timeout);
     source.put("spring.redis.cluster.max-redirects", redirects);
     return new RedisClusterConfiguration(new MapPropertySource("RedisClusterConfiguration", source));
 }
 @Bean 
 public JedisConnectionFactory redisConnectionFactory(RedisClusterConfiguration configuration){ 
            JedisPoolConfig poolConfig = new JedisPoolConfig();
           //poolConfig.setMaxIdle(maxIdle);
            //poolConfig.setMaxTotal(maxTotal);
            //poolConfig.setMaxWaitMillis(maxWaitMillis);
            //poolConfig.setTestOnBorrow(testOnBorrow);
            return new JedisConnectionFactory(configuration,poolConfig); 
        }
    /**
    * retemplate相关配置
    * @param factory
    * @return
    */
 @Bean 
 public RedisTemplate<String, Object> redisTemplate(JedisConnectionFactory factory) { 
     RedisTemplate<String, Object> template = new RedisTemplate<>();
     // 配置连接工厂
    // template.setConnectionFactory(factory);
     
     //使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值（默认使用JDK的序列化方式）
     Jackson2JsonRedisSerializer jacksonSeial = new Jackson2JsonRedisSerializer(Object.class);
     ObjectMapper om = new ObjectMapper();
   //  om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
    // jacksonSeial.setObjectMapper(om);
     template.setValueSerializer(jacksonSeial);
     template.setHashKeySerializer(new StringRedisSerializer());
     template.setHashValueSerializer(jacksonSeial);
     template.afterPropertiesSet();
     return template; 
 }
}
