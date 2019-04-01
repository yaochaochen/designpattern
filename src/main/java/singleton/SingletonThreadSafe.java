package singleton;

/**
 * 线程安全写法 单例模式最优写法
 */

public class SingletonThreadSafe {
    
    private static volatile  SingletonThreadSafe instance;
    
    private SingletonThreadSafe() {
        
    }
    public static SingletonThreadSafe getInstance() {
        if(instance == null) {
            synchronized (SingletonThreadSafe.class){
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
            
        }
        return  instance;
    }
    
}
