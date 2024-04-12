/*
 * this program uses bubble sort to sort N integers
 * 
 * Input 
 * N
 * x1 x2 x3 ... xn
 * Output
 * all xi in asceding order
*/


import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("N:");
        int n=s1.nextInt();
        int[] arr = new int[n];
        System.out.print("Arr: ");
        for(int i=0;i<n;i++){
            arr[i]=s1.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    arr[j]-=arr[i];
                    arr[i]+=arr[j];
                    arr[j]*=-1;
                    arr[j]+=arr[i];
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        s1.close();
    }
}
