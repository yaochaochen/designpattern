package design.singleton;

/**
 * 客户端
 * 
 */

public class SingletonClient {

    public static void main(String[] args) {

        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();

        if (instance1.equals(instance2)) {
            System.out.println("同样的实例");
        } else {
            System.out.println("不同的实例");
        }

    }
}
