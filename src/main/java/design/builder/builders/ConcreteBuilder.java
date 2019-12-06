package design.builder.builders;

public class ConcreteBuilder implements Builder {

    private final  Product product = new Product();

    @Override
    public void buildGround() {
        System.out.println("build基地");
        product.setGround("基地");
    }

    @Override
    public void buildCement() {
        System.out.println("build水泥");
        product.setCenment("水泥");
    }

    @Override
    public void buildRoof() {

        System.out.println("build楼顶");
        product.setRoof("楼顶");

    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
