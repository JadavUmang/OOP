public class StringBufferClassMethods {
    public static void main(String[] args){
        StringBuffer a = new StringBuffer("Hello");
        System.out.println(a.length());
        System.out.println(a.capacity());
        StringBuffer b = new StringBuffer(" abc");
        System.out.println(a.delete(1,3));
        System.out.println(b.capacity());
        System.out.println(b.insert(0,"abc"));
        System.out.println(a instanceof StringBuffer);      //Example of instance of,It is used to check whether a given object belongs to a perticular class or not.
        System.out.println(b.capacity());
    }
}
