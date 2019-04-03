package template;


/**
 * 模板方法抽象类：不变的部分给出具体实现，变化的部分封装未抽象方法延迟到子类实现
 */

public abstract class AbstractTemplate {
    public abstract void primitiveOpreation1();
    
    public abstract void primitiveOpreation2();
    
    
    public void templateMethod() {
        
        primitiveOpreation1();
        primitiveOpreation2();
        System.out.println("模板方法结束....");
    }
    
}
