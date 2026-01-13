import java.util.Arrays;
import java.util.Scanner;

public class SmallestandLargestElement {
    static int[] smallestAndLargestELement(int[] arr ){
        Arrays.sort(arr);

      int[] ans = {arr[0], arr[arr.length-1]};
      return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n= sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[n];

        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
       int[] ans = smallestAndLargestELement(arr);
        System.out.println("Smallest array : " + ans[0]);
        System.out.println("Largest array : " + ans[1]);
    }
}
