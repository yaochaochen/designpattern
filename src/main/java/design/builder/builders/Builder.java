package design.builder.builders;

public interface Builder {

    //有多少配件就有多少方法
    void  buildGround();

    void buildCement();

    void buildRoof();

    Product buildProduct();

}
