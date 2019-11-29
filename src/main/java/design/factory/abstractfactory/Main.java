package design.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {

        Factory factory = new TCLFactiry();
        Television television = factory.newTelevision();
        Refrigerator refrigerator = factory.newRefrigerator();
        television.dosomething();
        refrigerator.dosomething();

        factory = new MeilDFactory();
        television = factory.newTelevision();
        refrigerator = factory.newRefrigerator();
        television.dosomething();
        refrigerator.dosomething();
    }
}
