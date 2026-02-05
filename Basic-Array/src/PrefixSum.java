import java.util.Scanner;

public class PrefixSum {
//    Given an integer array 'a', return the prefix sum/running sum in the same array.
    static void makePrefixSum(int[] arr){
        int n= arr.length;

        for(int i=1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }

        //using extra space
//        int[] pref = new int[n];
//        pref[0] = arr[0];
//
//        for(int i=1; i<n; i++){
//            pref[i] = pref[i-1] + arr[i];
//        }
//        return pref;
    }


//    For a given array of integers of size n, answer q queries to print the sum of values in a given range of indices from l to r
    static  void printArray(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       makePrefixSum(arr);
        printArray(arr);
    }
}
