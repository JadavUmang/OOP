class MultilevelInheritance {
    int a = 100;
    public void display(){
        System.out.println("Value of a = "+a);
    }
    public static void main(String []args){
        Inheritance2 i2 = new Inheritance2();
        i2.display();
    }
}
 class Inheritance1 extends MultilevelInheritance{
    int a = 200;

    public void display() {
        System.out.println("Value of a = "+a);
        super.display();
    }
}

class Inheritance2 extends Inheritance1{
    int a = 300;
    public void display(){
        System.out.println("Value Of A = "+a);
        super.display();
    }
}
