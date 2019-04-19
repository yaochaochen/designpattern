package concuryency.unsafe.singleton;

/**
 * 懒汉模式
 * 单列在第一次被创建
 * 线程不按全的
 */
public class Singleton {

    private Singleton() {

    }

    private static Singleton singleton = null;
    //静态工厂模式
    public static Singleton getInstance() {

        if(singleton == null) {

            singleton = new Singleton();
        }
        return singleton;
    }

}
