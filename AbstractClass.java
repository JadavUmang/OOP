public class AbstractClass extends Bike{
    public static void main(String[] args){
        AbstractClass a = new AbstractClass();
        a.print();
        a.run();
    }
    void run(){
        System.out.println("IN Running Method.");
    }
}

abstract class Bike{
    abstract void run();
    void print(){
        System.out.println("Hi non abstract method.");
    }
}
