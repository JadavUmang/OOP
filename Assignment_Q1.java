import java.util.Scanner;

public class Assignment_Q1 {
    public static int vowel(char ch){
        char arr[] = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<arr.length;i++){
            if(ch == arr[i]){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 Character : ");
        char ch =  sc.next().charAt(0);
        if(vowel(ch)==1){
            System.out.println("Character is vowel.");
        }else {
            System.out.println("Character Is Constant.");
        }
    }
}
