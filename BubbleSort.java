import java.util.Scanner;

public class BubbleSort {
    public static int[] Sort(int arr[]){

        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        return arr;
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

        System.out.print("UnSorted Array IS : ");
        for(int i = 0 ; i <arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        int res[] ;
        res = Sort(arr);
        System.out.print("\nSorted Array IS : ");
        for(int i = 0 ; i <res.length;i++){
            System.out.print(res[i]+"\t");
        }
    }
}


