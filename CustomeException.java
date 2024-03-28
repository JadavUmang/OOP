
class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

public class CustomeException {
    public static void main(String[] args){
        float x = 5;
        float y = 1000;
        try{
            float z = x/y;
            if(z<0.01){
                throw new MyException("Number Is too small.");
            }
        }catch(MyException e){
            System.out.println("Caught my exception.");
            System.out.println(e.getMessage());
        }
    }
}
