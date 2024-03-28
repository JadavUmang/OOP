
class MyException1 extends RuntimeException{
    MyException1(String msg){
        super(msg);
    }
}

public class RuntimeException1 {
    public static void main(String[] args){
        float x = 5;
        float y = 1000;
        try{
            float z = x/y;
            if(z<0.01){
                throw new MyException1("Number Is too small.");
            }
        }catch(MyException1 e){
            System.out.println("Caught my exception.");
            System.out.println(e.getMessage());
        }
    }
}
