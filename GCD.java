import java.util.Scanner;
    public class GCD {
        int n1, n2, GCD;
        public int findGcd(int a, int b) {
            int result = 1;
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    result = i;
                }
            }
            return result;
        }
        public int GCD1(int a,int b){
            if(b==0){
                return a;
            }
            return GCD1(b,a%b);
        }
        public static void main(String[] args) {
            GCD g = new GCD();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number 1  :");
            g.n1 = sc.nextInt();
            System.out.print("Enter Number 2  :");
            g.n2 = sc.nextInt();
            g.GCD = g.findGcd(g.n1, g.n2);
            System.out.println("GCD of " + g.n1+" and " + g.n2 + " is =" + g.GCD);
            g.GCD = g.GCD1(g.n1, g.n2);
            System.out.println("GCD of " + g.n1+" and " + g.n2 + " is =" + g.GCD);
        }
    }
