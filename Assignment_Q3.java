import java.util.Scanner;

public class Assignment_Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Area Of Circle. \n2. Area of Square. \n3. Area Of Rectangle \n4. Area Of Triangle");

        System.out.print("Enter Your choice : ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                float radius = sc.nextFloat();
                System.out.println("Area of the circle: " + area(radius));
                break;
            case 2:
                System.out.print("Enter the length of the square: ");
                int len = sc.nextInt();
                System.out.println("Area of the square: " + area(len));
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                int length = sc.nextInt();
                System.out.print("Enter the width of the rectangle: ");
                int width = sc.nextInt();
                System.out.println("Area of the rectangle: " + area(length, width));
                break;
            case 4:
                System.out.print("Enter the base length of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                System.out.println("Area of the triangle: " + area(base, height));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static double area(float r){
        return r*r*3.14;
    }

    public static int area(int len){
        return len*len;
    }


    public static int area(int l,int b){
        return l*b;
    }
    public static double area(double b, double h) {
        return 0.5 * b * h;
    }
}
