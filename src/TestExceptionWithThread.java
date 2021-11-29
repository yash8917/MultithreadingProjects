public class TestExceptionWithThread extends Thread{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException obj){
            System.out.println("Your programme is Genrated the Exception.\nPlease Resolve This Exception.");
        }
    }
}
