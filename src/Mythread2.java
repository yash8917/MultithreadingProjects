class Mythread2 extends Thread{
    public  void run(){
//        for(int i=0;i<10 ;i++){
//            System.out.println("Mythread"+i);
//        }
        System.out.println(10/0);
    }
}
class Test56{
    public static void main(String[] args) {
        Mythread2 obj= new Mythread2();
        //or
        //Thread obj1=new Mythread();  //polymorphic behaviour
        obj.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread"+1 );// if u can exe. the multithreading the
            // application it will not give the same o/p it will give diiff. macine and operating system
        }
    }
}