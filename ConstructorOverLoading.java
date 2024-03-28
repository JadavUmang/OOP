import java.util.Scanner;

public class ConstructorOverLoading {
    String name;
    int roll;
    float cgpa;

    ConstructorOverLoading(){
        name = "ABC";
        roll = 123;
        cgpa = 5.0f;
    }
    ConstructorOverLoading(ConstructorOverLoading C){
        name = C.name;
        roll = C.roll;
        cgpa = C.cgpa;
    }
    private int add(int a,int b){
        int sum = a+b;
        return sum;
    }
    ConstructorOverLoading(String a,int b,float c){
        name = a;
        roll = b;
        cgpa = c;    }

    public void  Grade(ConstructorOverLoading A,ConstructorOverLoading B){
        System.out.println("Calculating Grade Of Both Students "+A.name+" And "+B.name);
        if(A.cgpa >5){
            System.out.println("Student "+A.name+" having roll no "+A.roll+" Scored The Grade A");
        }else {
            System.out.println("Student "+A.name+" having roll no "+A.roll+" Scored The Grade B");
        }
        if(B.cgpa >5){
            System.out.println("Student "+B.name+" having roll no "+B.roll+" Scored The Grade A");
        }else {
            System.out.println("Student "+B.name+" having roll no "+B.roll+" Scored The Grade B");
        }
    }

    public ConstructorOverLoading maxCGPA(ConstructorOverLoading A,ConstructorOverLoading B){
        if(A.cgpa> B.cgpa){
            return A;
        }else
            return B;
    }

    public static void main(String[] args){
        ConstructorOverLoading ob1 = new ConstructorOverLoading();
//        ConstructorOverLoading ob2 = new ConstructorOverLoading("Umang",1234,9.9f);
//        ConstructorOverLoading ob3 = new ConstructorOverLoading(ob2);
//        ob1.Grade(ob1,ob3);
//        ConstructorOverLoading max = ob1.maxCGPA(ob1,ob3);
//        System.out.println("Student having Name "+max.name+" roll no " +max.roll+" Scored max CGPA "+max.cgpa);
       int result = ob1.add(10,20);

        System.out.println(result);

    }
}