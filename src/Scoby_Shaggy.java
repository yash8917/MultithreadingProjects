//Create two threads and assign names ‘Scooby’ and ‘Shaggy’
// to the two threads. Display both thread names.
class Thread_1 extends Thread{

    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Scooby");
    }
}
class Thread_2 extends Thread{
    public void run(){
        System.out.println("Shaggy");
    }
}

public class Scoby_Shaggy{
    public static void main(String[] args) {
    Thread_1 t=new Thread_1();
    t.start();

    Thread_2 t1=new Thread_2();
    t1.start();
    }
}
