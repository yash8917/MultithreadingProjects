public class TestExceptionWithThread extends Thread{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException obj){
            System.out.println("Exception is  genrate");
        }
    }
}
