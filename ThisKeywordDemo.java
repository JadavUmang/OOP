public class ThisKeywordDemo {
    private int number=5;

    public ThisKeywordDemo() {
        this.number = 10;
    }

    public ThisKeywordDemo(int number) {
        this.number = number;
    }

    public void displayNumber() {
        System.out.println("Number: " + this.number);
    }

    public void callDisplayNumber() {
        this.displayNumber(); 
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj1 = new ThisKeywordDemo();
        obj1.displayNumber(); 

        ThisKeywordDemo obj2 = new ThisKeywordDemo(20);
        obj2.callDisplayNumber(); 
    }
}
