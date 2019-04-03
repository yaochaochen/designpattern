package design.adapter;

public class AdapterClient {
    
    public static void main(String[] args) {
        
        Target target;
        target = new Adapter();
        target.requst();
    }
}
