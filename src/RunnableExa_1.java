class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Runable method");
    }
}
public class RunnableExa_1 {
    public static void main(String[] args) {
        MyRunnable t=new MyRunnable();
        Thread t1=new Thread(t);
        System.out.println("mainThead");
        t1.start();
    }
}
