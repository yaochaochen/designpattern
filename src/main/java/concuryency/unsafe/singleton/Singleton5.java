package concuryency.unsafe.singleton;

/**
 * 懒汉模式
 * 单列在第一次被创建
 * 线程安全的
 * synchronized影响 性能
 */
public class Singleton5 {

    private Singleton5() {

    }
    //volatile 避免指令重拍
    private volatile static Singleton5 singleton = null;

    //静态工厂模式 存在内存和CPU的指令重排 线程不安全的
    public  static  Singleton5 getInstance() {

        if (singleton == null) {
            synchronized (Singleton5.class) { //双重检测机制 依旧是线程不安全的
                if (singleton == null) { //同步锁
                    singleton = new Singleton5();
                }
            }
        }
        return singleton;
    }

}
