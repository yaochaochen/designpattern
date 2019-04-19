package concuryency.unsafe.singleton;

/**
 * 懒汉模式
 * 单列在第一次被创建
 * 线程安全的
 * synchronized影响 性能
 */
public class Singleton4 {

    private Singleton4() {

    }

    private static Singleton4 singleton = null;

    //静态工厂模式 存在内存和CPU的指令重排 线程不安全的
    public static Singleton4 getInstance() {

        if (singleton == null) {
            synchronized (Singleton4.class) { //双重检测机制 依旧是线程不安全的
                if (singleton == null) { //同步锁
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }

}
