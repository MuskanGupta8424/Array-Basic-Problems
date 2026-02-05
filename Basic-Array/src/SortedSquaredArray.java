import java.util.Arrays;
import java.util.Scanner;

public class SortedSquaredArray {
//sorted non-decreasing order
    static int[] sortedSquareArray(int[] arr){
int i= 0; int j= arr.length-1;
int n= arr.length;
int k =0;
int[] ans =  new int[n];

    while(i<=j){
   if(Math.abs(arr[i])> Math.abs(arr[j])){
       ans[k++] = arr[i]*arr[i];
       i++;
   }else{
       ans[k++] = arr[j] * arr[j];
       j--;
   }
    }
return ans;
    }
    static  void reverse(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
    }
    static void printArray(int[] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }


        static void frequencySort(int[] arr) {


            Arrays.sort(arr);
            int count = 0;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                }else{
                    System.out.println(arr[i] + "----------- " + count);
                    count =1;
                }
            }

        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value of an array ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
//        int[] ans = sortedSquareArray(arr);
         frequencySort(arr);
//        reverse(ans);
//
//        printArray(ans);
//
    }
}
