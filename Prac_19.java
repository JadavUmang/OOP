// Demonstrate the use of 1. String class method 2. String buffer class method (6 each).

public class Prac_19 {
        static void p(Object s){
            System.out.println(s);
        }
        public static void main(String[] a) {
            p("String methods: ");
            String s = "Umang";
            p(s.charAt(0));
            p(s.length());
            p(s.toLowerCase());
            p(s.toUpperCase());
            p(s.equals("umang"));
            p(s.equalsIgnoreCase("Umang"));
            p(s.matches("ang"));
            p(s.contains("ang"));

            p("\nString Buffer methods:");
            StringBuffer sb = new StringBuffer("Hello");
            p(sb.append(" World !"));
            p(sb.insert(5,"java"));
            p(sb.replace(1,5,""));
            p(sb.delete(0,5));
            p(sb.deleteCharAt(0));
            p(sb.capacity());
            p(sb.lastIndexOf("rld"));
            p(sb.reverse());
        }
}
