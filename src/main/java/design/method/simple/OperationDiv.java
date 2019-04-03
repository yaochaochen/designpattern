package design.method.simple;

public class OperationDiv extends  Operation {
    public double result() {
        if(numberB == 0) {

            throw  new RuntimeException("divided by 0");
        }
        return numberA / numberB;
    }
}
