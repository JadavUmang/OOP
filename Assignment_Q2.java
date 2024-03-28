import java.util.Scanner;

public class Assignment_Q2 {
    public static int max(int arr[]){
        int max=0;
        for(int i=0;i< arr.length;i++){
            if(arr[max]<=arr[i]){
                max = i;
            }
        }
        return arr[max];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+i+" number :");
            arr[i]= sc.nextInt();
        }
        int max = max(arr);
        System.out.println("Maximum Element IS :"+max);
    }
}
