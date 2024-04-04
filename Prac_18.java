public class Prac_18 {
    private int a=100;
    Prac_18(int a) {
        this.a = a;
    }
    private void display(){
        System.out.println("Private A = "+a);
    }
    public void displayMethod(){
        display();
    }

    public static void main(String []args){
        Prac_18 p = new Prac_18(10);
        p.displayMethod();
    }
}
