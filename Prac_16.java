import java.util.Scanner;

public class Prac_16 {
    String name;
    int roll;
    double cgpa;

    Prac_16(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll NO : ");
        roll = sc.nextInt();
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter CGPA : ");
        cgpa = sc.nextDouble();
    }

    void dispay(Prac_16 p) {
        System.out.println("Details Of Student Is :");
        System.out.println("Student Name :"+p.name);
        System.out.println("Student ROll No :"+p.roll);
        System.out.println("Student Cgpa :"+p.cgpa);
        if(p.cgpa>5){
            System.out.println("Student Is Pass.");
        }else {
            System.out.println("Student Is Fail!!!");
        }
        System.out.println("-------------------------------");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total No. Of Students :");
        int n = sc.nextInt();
        Prac_16 arrObj[] = new Prac_16[n];
        for (int i=0;i<arrObj.length;i++){
            arrObj[i] = new Prac_16();
            arrObj[i].dispay(arrObj[i]);
        }
    }
}