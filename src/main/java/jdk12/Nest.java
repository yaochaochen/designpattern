package jdk12;

public class Nest {
    
    public void  A() {
        B  b = new B();
        System.out.println(b.s);
      //  System.out.println(b.C()); // jdk11版本不能通过
        
    }
    
    class B {
        
        private String s = "b";
        
        private void C() {
            System.out.println("f1");
        }
    }
    
    
}
