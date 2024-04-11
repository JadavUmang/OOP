public class InterfaceDemo implements i2{
    public void print(){
        System.out.println("Hello");
    }
    public void display(){
        System.out.println("aava de");
    }
    public static void main(String[] args){
       InterfaceDemo a = new InterfaceDemo();
        a.print();
        a.display();
    }
}
interface i1{
    void print();
}
interface i2 extends i1{
    void display();
}