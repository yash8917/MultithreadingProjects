
                //In Multithreading o/p is varied from jvm to jvm

class Mythread1 extends Thread{//This is the child Thread
        public void run(){
            //we are override the run Method That is nessasary to override which is present in Thread Class
            for(int i=0;i<5;i++){
            System.out.println("Child Method");
            }
        }
}
//This is the Main Thread is responsible for executing the main Method
public class MultithredingExa_1 {
    public static void main(String[] args) {//This is our main Method
        Mythread1 t=new Mythread1();// This is called the Thread Instantiiation
        t.start();//If we write t.run(); so Child Thread won't be created it will run the as normal method called.
        //Start method do sevral operation:- 1.Register this Thread with Thread Schedular
        //2.Prform all other mandatory Activities
        //3. invoke the run Method
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
