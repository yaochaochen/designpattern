package design.builder.builders;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildCement();
        builder.buildGround();
        builder.buildRoof();
        return  builder.buildProduct();

    }

}
