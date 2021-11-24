//public class Runnable_Interface {
//}
////by using Runnable Interface
class Runnable_Interface implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName("E sec ");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class Test57{
    public static void main(String[] args) {
        //Runnable_Interface obj =new Runnable_Interface();
        Thread obj1=new Thread(new Runnable_Interface());// annonymous object
        obj1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Mean thread");

        }
    }
}