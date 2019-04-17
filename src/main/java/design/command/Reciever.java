package design.command;

 interface Reciever {

     public void action();


}
 class RecieverA implements Reciever {


     @Override
     public void action() {
         System.out.println("RecieverA执行请求");
     }
 }

class RecieverB implements Reciever {


    @Override
    public void action() {
        System.out.println("RecieverB执行请求");
    }
}

class RecieverC implements Reciever {


    @Override
    public void action() {
        System.out.println("RecieverC执行请求");
    }
}



