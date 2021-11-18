//public class TestLabThread {
//}
class Mythread extends Thread
{
    public static void main(String[] args) {
        Thread obj =Thread.currentThread();
        obj.setName("Yash"); // we can change the name of the thread method by set name method
        System.out.println(obj.isAlive());// return the boolean value of he thread is in running statement or not
        System.out.println(obj.getName());// return the live thread
        System.out.println(obj.isDaemon()); // return the which runs on the background
        System.out.println(obj.getPriority());// check the priority value of th ethread
        obj.setPriority(Thread.NORM_PRIORITY);// set the priority value
        System.out.println(obj.getId());// print id of the method
        System.out.println(obj.getState());// weather it is runable or running
        //System.out.println(10/0);
    }
}