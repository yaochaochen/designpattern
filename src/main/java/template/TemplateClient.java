package template;

/**
 * @ClassName TemplateClient
 * @Author yaochaochen
 * main方法实现
 * @Date 2019-04-03 09:25
 **/
public class TemplateClient {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate;
        abstractTemplate = new ConcreteClassA();
        abstractTemplate.templateMethod();
        
        abstractTemplate = new ConcreteClassB();
        abstractTemplate.templateMethod();
        
    }
}
