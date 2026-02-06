import java.util.Scanner;

public class EqualSumPartition
{
    static int finSumArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum= sum+ arr[i];
        }
        return sum;
    }
    static boolean makeEqualSumPartition(int[] arr){
        int totalSum = finSumArray(arr);
        int prefixSum =0;

        for(int i=0; i<arr.length; i++){
            // totalSum = prefixSum + suffixSum
            prefixSum = prefixSum +arr[i];
            int suffixSum = totalSum - prefixSum;

            if(prefixSum == suffixSum){
                return true;
            }
        }
return false;
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter no. of elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean ans  = makeEqualSumPartition(arr);
        System.out.println( "Equal Partition possible: " + ans);

//        printArray(arr);


    }
}
