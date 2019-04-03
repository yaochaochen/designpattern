package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName JdkDynamicProxyTest
 * @Author yaochaochen
 * @Date 2019-04-03 14:49
 **/
public class JdkDynamicProxyTest implements InvocationHandler {

    private Target target;
    private JdkDynamicProxyTest(Target target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
        
    }
    
    public static Target newProxyInstance(Target target) { 
        return (Target) Proxy.newProxyInstance(JdkDynamicProxyTest.class.getClassLoader(),
                new Class<?>[]{Target.class}, new JdkDynamicProxyTest(target));
    }
}
