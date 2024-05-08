// You are given a method divide which will accept 2 numbers and divide it if the second number is 0 then throw arithmetic exception with it's cause io exception white a program using chained exception.

import java.io.IOException;
import java.util.Scanner;
public class Prac_22 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter Number 1 : ");
        n1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        n2 = sc.nextInt();
        try {
            if(n2==0){
                ArithmeticException ae = new ArithmeticException("IO Exception");
                ae.initCause(new IOException("IO Exception."));
                throw ae;
            }else {
                System.out.println(n1/n2);
            }
        }catch (ArithmeticException ae){
            System.out.println(ae);
            System.out.println(ae.getCause());
        }
    }
}
