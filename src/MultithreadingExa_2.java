class Mythrad2 extends Thread{

    public void run(){
        System.out.println("run Method");
    }
    //Overloaded Method called by Explecitly
    public void run(int i){
        System.out.println("Overloaded Method");
    }
}
public class MultithreadingExa_2 {
    public static void main(String[] args) {
        Mythread2 t=new Mythread2();
        t.start();
        System.out.println("Main Method");
        // o
        //o/p is -run Method
        //run method overloading is possible
    }
}
