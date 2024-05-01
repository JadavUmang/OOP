import java.util.Scanner;

public class Inherit1 extends Employee{
    float bonus = 80.0f;

    public float get_bonus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bonus Of Employee : ");
        bonus = sc.nextFloat();
        return bonus;
    }

    public float total_salary(float sal,float bon){
        System.out.println("Bonus Amount : "+(sal*(bon/100)));
        float total = (sal*(bon/100))+sal;
        return total;
    }
    public  static void main(String[] args){
        Inherit1 i1 = new Inherit1();
        Scanner sc = new Scanner(System.in);
        float sal = i1.get_salary();
        float bonus = i1.get_bonus();
        float tot = i1.total_salary(sal,bonus);
        System.out.println("Total Salary = "+tot);
    }
}

class Employee{
    float salary = 40000.0f;
    public float get_salary(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary Of Employee : ");
        salary = sc.nextFloat();
        return salary;
    }
}
