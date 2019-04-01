package factory.method.abstraction;

import factory.method.simple.Operation;

public class Client {
    
    
    public static  void main(String[] args) throws  InstantiationException,IllegalAccessException {

        Operation operation = OperationFactory.createOperation("/");
        operation.numberA = 7.0;
        operation.numberB = 8.0;
        System.out.println(operation.result());
    }
}
