package design.factory.abstractfactory;

/**
 * 工厂接口
 */
public interface Factory {

    /**
     * 抽象产品
     * @return {@link Television}
     */
    Television newTelevision();

    /**
     * 抽象产品
     * @return {@link Refrigerator}
     */
    Refrigerator newRefrigerator();
}
