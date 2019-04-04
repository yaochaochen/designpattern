package design.bridge;

/**
 * 
 * 桥稼模式
 * @ClassName BridgeClient
 * @Author yaochaochen
 * @Date 2019-04-04 20:46
 **/
public class BridgeClient {

    public static void main(String[] args) {

        Abstraction a = new AbstractionA("A");
        a.setImplementor(new ConcreteImplemtorA());
        a.operation();
        a.setImplementor(new ConcreteImplemtorB());
        a.operation();

        Abstraction b = new AbstractionB("B");
        b.setImplementor(new ConcreteImplemtorA());
        b.operation();
        b.setImplementor(new ConcreteImplemtorB());
        b.operation();
        
        AbstractionC c = new AbstractionC("C");
        c.setImplementor(new ConcreteImplemtorB());
        c.operation();
        c.setImplementor(new ConcreteImplemtorC());
        c.operation();
        // 这样通过使用“组合/聚合复用原则”
        // 如果继续有AbstractionC ... 或者ConcreteImplemtorC ...
        // 只需要扩展类即可，不需要修改现有类，符合“开放-封闭”原则
    }
    
    
}
