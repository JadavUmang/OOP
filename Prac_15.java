import java.util.Scanner;

public class Prac_15 {
    int roll;
    double cgpa;
    String name;

    Prac_15(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    Prac_15() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No Of Student : ");
        roll  = sc.nextInt();
        System.out.print("Enter Name Of Student : ");
        name  = sc.next();
        System.out.print("Enter CGPA Of Student : ");
        cgpa  = sc.nextDouble();
    }

    public void display(Prac_15 A) {
        if (A.cgpa > 5) {
            System.out.println("Student " + A.name + " Having Roll no " + A.roll + " Is Pass.");
        } else {
            System.out.println("Student " + A.name + " Having Roll no " + A.roll + " Is Fail.");
        }
    }

    public static void main(String[] args) {
        Prac_15 s1 = new Prac_15();
        s1.display(s1);
        Prac_15 s2 = new Prac_15();
        s2.display(s2);
    }
}