class Mythread3 extends Thread{
    public void run(){
        System.out.println("Run method");
    }
}
public class MultitreadingExam_3 {
    public static void main(String[] args) {
        Mythread3 t=new Mythread3();
        t.setName("Demo_1");
        System.out.println(t.getName());//return the name of the Thread
        System.out.println(t.getId());
        System.out.println(t.isAlive());
        System.out.println(t.hashCode());
        System.out.println(t.isDaemon());
        System.out.println(t.getState());
        System.out.println(t.toString());
        System.out.println(t.isInterrupted());
        System.out.println(t.getThreadGroup());
        System.out.println(t.getPriority());
    }
}