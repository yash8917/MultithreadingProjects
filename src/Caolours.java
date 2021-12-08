//store colours in the form of an array
//        ex: String colours[]={"white","blue","black","green","red","yellow"};
//        display all colours repeatedly by generating colour index from Random class.
//        If the random colour index matches to red stop display.
//        Note: perform this task by implementing Runnabe interface
class MyRunnable1 implements Runnable{
    public void run(){
        String colours[]={"White","Blue","Black","Green","Red","Yellow"};
        for (int i = 0; i < colours.length; i++) {
            if(colours[i]=="Red"){
                break;
                //Break the loop when red colour is get
            }else {
                System.out.println(colours[i]);
                //print all colour expect Red
            }
        }
    }
}
public class Caolours {
    public static void main(String[] args) {
        MyRunnable1 r=new MyRunnable1();
        Thread t=new Thread(r);
        t.start();
    }
}
