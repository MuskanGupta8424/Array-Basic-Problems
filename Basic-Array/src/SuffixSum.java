import java.util.Scanner;

public class SuffixSum {
    static void makeSuffixSum(int[] arr){
        int n = arr.length;
        for(int i=n-2; i>0; i--){
            arr[i] = arr[i+1] + arr[i];
        }

    }

    static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter no of elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        makeSuffixSum(arr);
        printArray(arr);
    }
}
