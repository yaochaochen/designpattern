package factory.method;

import factory.method.simple.Operation;

/**
 * 工厂方法客户端
 * @author yaochaochen
 */

public class FactoryClient {
    public static void main(String[] args) {
        IFactory operFactory = new DivFactory();
        Operation operation = operFactory.createOperation();
        operation.numberA = 1.2;
        operation.numberB = 1.3;
        System.out.println(operation.result());
        
    }
}
