import java.util.Scanner;

public class CopyConstructor {

    int a,b;
    CopyConstructor(){
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    }
    CopyConstructor(CopyConstructor c){
        this.a = c.a;
        this.b = c.b;
    }
    public static void main(String[] args){
        CopyConstructor c = new CopyConstructor();
    }
}
