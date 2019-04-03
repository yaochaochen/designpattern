package design.builder;

/**
 * 具体构建者2
 */

public class ConcreteBuilder2 extends Builder{
    Product product = new Product();

    public void buildPartA() {
        product.add("部件2A");
        
    }

    public void buildPartB() {
        product.add("部件2B");

    }

    public Product getBuildResult() {
        return product;
    }
}
