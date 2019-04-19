package concuryency.unsafe.singleton;

/**
 * 饿汉模式
 * 单列在第一次被创建
 * 线程不按全的
 * 过多处理 资源浪费
 * 私有构造没太多的处理
 * 造成资源浪费
 */
public class Singleton2 {

    private Singleton2() {

    }

    private static Singleton2 singleton = new Singleton2();
    //静态工厂模式
    public static Singleton2 getInstance() {

        return singleton;
    }

}
