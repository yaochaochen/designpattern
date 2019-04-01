package builder;

/**
 * 具体建造者1
 */

public class ConcreteBuilder1 extends Builder{
    Product product = new Product();

    public void buildPartA() {
        product.add("部件A");
        
    }

    public void buildPartB() {
        product.add("部件B");

    }

    public Product getBuildResult() {
        return product;
    }
}
