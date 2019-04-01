package builder;

/**
 * 指挥者 用来指挥建造过程
 * @author yaochaochen
 */

public class Diretor {
    
    public void  construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        
    }
}
