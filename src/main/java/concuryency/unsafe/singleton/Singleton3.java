package concuryency.unsafe.singleton;

/**
 * 懒汉模式
 * 单列在第一次被创建
 * 线程安全的
 * synchronized影响 性能
 */
public class Singleton3 {

    private Singleton3() {

    }

    private static Singleton3 singleton = null;
    //静态工厂模式
    public static synchronized Singleton3 getInstance() {

        if(singleton == null) {

            singleton = new Singleton3();
        }
        return singleton;
    }

}
