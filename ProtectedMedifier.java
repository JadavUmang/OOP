import java.util.Scanner;

public class ProtectedMedifier extends ProtectedMedifier1{
    public static void main(String[] args){
        ProtectedMedifier p1 = new ProtectedMedifier();
        System.out.println(p1.a);
        p1.display();
    }
}

class Modifier{
    protected int a;
}

class ProtectedMedifier1 extends Modifier{
    void display(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value Of A : ");
        a = sc.nextInt();
        System.out.print("Value Of A : "+a);
    }

}

