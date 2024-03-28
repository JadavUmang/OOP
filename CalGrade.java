import java.util.Scanner;

public class CalGrade {
    public static void GradeScore(int a,int b){
        if(a+b <= 50 && a+b>=40){
            System.out.println("Grade Of Internal Marks Is : AA");
        } else if (a+b <= 40 && a+b>=30) {
            System.out.println("Grade Of Internal Marks Is : BB");
        }else if (a+b <= 30 && a+b>=20) {
            System.out.println("Grade Of Internal Marks Is : CC");
        }else {
            System.out.println("Grade Of Internal Marks Is : FF");
        }
    }
    public static void GradeScore(Float a){
        if(a<=70 && a>=60){
            System.out.println("Grade Of External Marks Is : AA");
        } else if (a <= 60 && a>=50) {
            System.out.println("Grade Of External Marks Is : BB");
        } else if (a <= 50 && a>=40) {
            System.out.println("Grade Of External Marks Is : CC");
        } else if (a <= 40 && a>=30) {
            System.out.println("Grade Of External Marks Is : DD");
        }else {
            System.out.println("Grade Of External Marks Is : FF");
        }
    }
    public static void GradeScore(int a){
            if(a>=15){
                System.out.println("You Passed Viva.");
            }else {
                System.out.println("Congrats!.. You got another chance to give viva...");
            }
    }
    public static void GradeScore(Float a,int b,int c){
        Float sum = a+b+c;
        if (a<30 || b<20 || c<15){
            System.out.println("You are Fail.");
        }else if ( sum <= 150 && sum >= 120){
            System.out.println("Your Overall Grade Is AA.");
        }else if ( sum <= 120 && sum >= 90){
            System.out.println("Your Overall Grade Is BB.");
        }else if ( sum <= 90 && sum >= 60){
            System.out.println("Your Overall Grade Is CC.");
        }else if ( sum <= 60 && sum >= 50){
            System.out.println("Your Overall Grade Is DD.");
        }
    }
    public static void main(String[] args){
        int mid,practical,viva;
        Float mark;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your External Marks Outof 70 :");
        mark = sc.nextFloat();
        System.out.print("Enter Your Internal - Mid Marks Outof 30 :");
        mid = sc.nextInt();
        System.out.print("Enter Your Internal - Practical Marks Outof 20 :");
        practical = sc.nextInt();
        System.out.print("Enter Your Viva Marks Outof 30 :");
        viva = sc.nextInt();
        GradeScore(mark);
        GradeScore(mid,practical);
        GradeScore(viva);
        GradeScore(mark,(mid+practical),viva);
    }
}