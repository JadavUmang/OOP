import java.util.Scanner;

public class ArrayOfObjects {
    String name;
    int id;
    double rate;

    ArrayOfObjects(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id : ");
        id= sc.nextInt();
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Rate : ");
        rate = sc.nextDouble();
    }

    ArrayOfObjects(int id,String name,double rate){
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    void dispay() {
        System.out.println("Details Of Product Is :");
        System.out.println("Product Name :"+name);
        System.out.println("Product Id :"+id);
        System.out.println("Product Rate :"+rate);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args){
        ArrayOfObjects arrObj[] = new ArrayOfObjects[5];
        for (int i=0;i<arrObj.length;i++){
           arrObj[i] = new ArrayOfObjects();
           arrObj[i].dispay();
        }
        System.out.println("The Details of the product are :");
    }
}