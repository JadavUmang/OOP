class Hierarchical1 {
    int a = 10;
    public int increment(){
        return ++a;
    }
}
class Hierarchical2 extends Hierarchical1{
    int b= 400;
    public int increment(){
        return ++b;
    }
    public void display(){
        System.out.println(super.increment());
        System.out.println(increment());
    }
}

public class HierarchicalInheritance extends Hierarchical1{
    int b = 100;
    public int increment(){
        return ++b;
    }
    public void display(){
        System.out.println(super.increment());
        System.out.println(increment());
    }
    public static void main(String[] args){
        HierarchicalInheritance h1 = new HierarchicalInheritance();
        h1.display();
        Hierarchical2 h2 = new Hierarchical2();
        h2.display();
    }
}
