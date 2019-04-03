package proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName CglibProxyTest
 * @Author yaochaochen
 * @Date 2019-04-03 14:49
 **/
public class CglibProxyTest implements MethodInterceptor {
    
    private  CglibProxyTest() {
        
    }
    public static <T extends Target> Target newProxyInstance(Class<T> targetInstanceClazz) { 
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetInstanceClazz);
        enhancer.setCallback(new CglibProxyTest());
        return (Target) enhancer.create(); 
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            return methodProxy.invokeSuper(o, objects);
    } 
}
