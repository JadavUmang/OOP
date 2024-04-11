import java.io.IOException;

public class ChainedException {
    public static void main(String []args){
        try {
            divide(10,0);
        }catch (ArithmeticException ae){
            System.out.println(ae);
            System.out.println(ae.getCause());
        }
    }
    public static void divide(int a , int b){
        if(b==0){
            ArithmeticException ae = new ArithmeticException("Top Message");

            ae.initCause(new IOException("Divide BY Zero."));
            throw ae;
        }else {
            System.out.println(a/b);
        }
    }
}
