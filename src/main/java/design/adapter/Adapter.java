package design.adapter;

/**
 * 适配器 通过内部类包装一个 adaptee 对象 把原资源转换为目标资源
 */
public class Adapter extends Target {
    
    private Adaptee adaptee = new Adaptee();
    
    public void request() {
        adaptee.specificRequest();
    }
}
