package template;

/**
 * @ClassName ConcreteClassA
 * @Author yaochaochen
 * 具体实现
 * @Date 2019-04-03 09:22
 **/
public class ConcreteClassA extends AbstractTemplate{


    @Override
    public void primitiveOpreation1() {
        System.out.println("具体实现A");
    }

    @Override
    public void primitiveOpreation2() {
        System.out.println("具体实现B");
    }
}
