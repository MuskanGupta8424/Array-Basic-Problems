import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //[1,4,6,8,5]
    static int[] kthSmallestLargest(int[] arr, int k){
        Arrays.sort(arr);
        int[] ans = {arr[k-1], arr[arr.length-k]};
       return ans;
    }

    public static void main(String[] args) {

        //   kth Smallest and Largest element in array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of an array ");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k ");
        int k = sc.nextInt();

        int[] ans = kthSmallestLargest(arr,k);
        System.out.println("kth Smallest element " + ans[0]);
        System.out.println("kth Largest element " + ans[1]);
        sc.close();

    }
}