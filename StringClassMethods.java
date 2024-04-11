public class StringClassMethods {
    public static void main(String[] args){
        String a = "Hello";
        System.out.println(a.length());
        System.out.println(a.equals("Hello"));
        System.out.println(a.equalsIgnoreCase("HELLO"));
        String b = "abc";
        System.out.println(b.isEmpty());        // Returns false because string counts space
        b = "Xyz";
        System.out.println(a.concat(b));
        System.out.println(b.replace("Xyz","Abc"));     //The object of variable of String class will never been change even if you concat ,replace,trim of uppend any String.
        System.out.println(b);
        System.out.println(a.indexOf("l"));     // Whenever you try to get the index of a character which is not present in the string it will return -1.
        //System.out.println(a.charAt(5));        //when you try to access the location of the character whose values is greater then stringlength-1 we get string index out of bound exception.
        System.out.println(a.indexOf("l",1));
        System.out.println(b.trim());           //REmoves the space from string.
    }
}
