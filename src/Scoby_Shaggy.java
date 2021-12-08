//Create two threads and assign names ‘Scooby’ and ‘Shaggy’
// to the two threads. Display both thread names.
class Thread_1 extends Thread{

    public void run() {
//        when two thread are Execute simultaniously there will be a chance to get the Error coz
//        when you put the sleep method is execute so there is a chance to interrupt Exception
//        the second thread
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Scooby");
    }
}
//Creating the second Thread
class Thread_2 extends Thread{
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Shaggy");
    }
}

public class Scoby_Shaggy{
    public static void main(String[] args) {
    Thread_1 t=new Thread_1();// create the Object of thread first
    t.start();
    Thread_2 t1=new Thread_2();//creating the second Object
    t1.start();
    }
}
