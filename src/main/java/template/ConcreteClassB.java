package template;

/**
 * @ClassName ConcreteClassB
 * @Author yaochaochen
 * 具体实现B
 * @Date 2019-04-03 09:23
 **/
public class ConcreteClassB extends AbstractTemplate{

    @Override
    public void primitiveOpreation1() {
        System.out.println("具体类B的方法1实现");
    }

    @Override
    public void primitiveOpreation2() {
        System.out.println("具体类的方法2实现");

    }
}
