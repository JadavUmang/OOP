import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Area Of Circle. \n 2. Area Of Ractangle \n 3.");
        int ch = sc.nextInt();
        switch (ch){
            case 1 :
                System.out.print("Enter Radious Of Circle : ");
                int r = sc.nextInt();
                System.out.println("Area Of Circle Is : "+area(r));
                break;

            case 2:
                System.out.print("Enter Length Of Ractangle : ");
                int l = sc.nextInt();
                System.out.print("Enter Base Of Ractangle : ");
                int b = sc.nextInt();
                System.out.println("Area Of Circle Is : "+area(l,b));
                break;

            default:
                System.out.println("Invalid Choice...");
                break;
        }
    }

    public static double area(int r){
        return r*r*(23/7);
    }

    public static int area(int l,int b){
        return l*b;
    }

}
