package design.bridge;

/**
 * @ClassName Implementor
 * @Author yaochaochen
 * @Date 2019-04-04 20:43
 **/
public abstract class Implementor {


    public abstract void operation();

}

class ConcreteImplemtorA extends Implementor {

    @Override
    public void operation() {
        System.out.println("ConcreteImplemtorA的方法执行");

    }

}

class ConcreteImplemtorB extends Implementor {

    @Override
    public void operation() {
        System.out.println("ConcreteImplemtorB的方法执行");

    }
   


}

class ConcreteImplemtorC extends Implementor {

    @Override
    public void operation() {
        System.out.println("执行C");
    }
}
