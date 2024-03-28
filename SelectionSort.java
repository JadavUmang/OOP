import java.util.Scanner;

public class SelectionSort {
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
        int res[] = Sort(arr);
        System.out.print("\nSorted Array IS : ");
        for(int i = 0 ; i <res.length;i++){
            System.out.print(res[i]+"\t");
        }
    }
    public static int[] Sort(int arr[]){

        int min;
        for (int i=0;i<arr.length-1;i++){
            min = i;
            for (int j=i+1;j<arr.length;j++){

                if(arr[j]<arr[min]){
                    min = j;
                }

            }
            if(min!=i){
                int t = arr[i];
                arr[i] = arr[min];
                arr[min] = t;
            }
        }
        return arr;
    }

}
