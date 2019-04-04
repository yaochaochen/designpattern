package design.bridge;

/**
 * @ClassName Abstraction
 * @Author yaochaochen
 * @Date 2019-04-04 20:44
 **/
public class Abstraction {


    protected Implementor implementor;// 桥接模式的关键，使得Abstraction聚合Implementor
    private String name;

    public Abstraction(String name) {
        this.setName(name);
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        System.out.print("Abstraction-" + this.getName() + ": ");
        implementor.operation();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class AbstractionA extends Abstraction {

    public AbstractionA(String name) {
        super(name);
    }

    @Override
    public void operation() {
        super.operation();
    }

}

class AbstractionB extends Abstraction {

    public AbstractionB(String name) {
        super(name);
    }

    @Override
    public void operation() {
        super.operation();
    }
    
    
  
}

class AbstractionC extends Abstraction {

    public AbstractionC(String name) {
        super(name);
    }
    @Override
    public void operation() {
        super.operation();
    }

}
