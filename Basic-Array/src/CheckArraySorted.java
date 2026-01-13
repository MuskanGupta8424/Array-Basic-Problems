import java.util.Scanner;

public class CheckArraySorted {

    static boolean checkArraySorted(int[] arr){
        boolean isSorted=true;

        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of an array ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
g


        System.out.println("Check the array is sorted : " + checkArraySorted(arr));
    }
}
