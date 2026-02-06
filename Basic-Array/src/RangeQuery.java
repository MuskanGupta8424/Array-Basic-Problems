import java.util.Scanner;

public class RangeQuery {
    //    Given an integer array 'a', return the prefix sum/running sum in the same array.
        static int[] makePrefixSum(int[] arr) {
            int n = arr.length;

            for (int i = 1; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i];
            }
            return arr;

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
            int[] arr = new int[n+1];

            System.out.println("Enter no of elements: ");
            for(int i =1; i<=n; i++){
                arr[i] = sc.nextInt();
            }
            int[] pref =  makePrefixSum(arr);
            System.out.println("Enter no of queries: ");
            int q = sc.nextInt();

            while(q-- >0){
                System.out.println("Enter range of prefix sum : ");
                int l= sc.nextInt();
                int r = sc.nextInt();

                int ans = pref[r] - pref[l-1];

                System.out.println("SUm " + ans);
            }

            printArray(pref);
        }

}
