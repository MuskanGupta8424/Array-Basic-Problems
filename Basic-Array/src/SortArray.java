import java.util.Scanner;

//Sort an array consisting of only 0s and 1s

public class SortArray {
    static void printArray(int[] arr){
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    static void swap(int[] arr, int i , int j){
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }

// Better approach
    static void sortedZeroOne(int[] arr){
        // [0, 0, 1,0, 1,1,0,0]
        int i=0, j = arr.length-1;
        while(i<j){
           if(arr[i] == 0){
               i++;
           }
           if(arr[j] ==1 ){
               j--;
           }
           if(arr[i] == 1 && arr[j] == 0){
               swap(arr, i, j);
               i++;
               j--;
           }
        }
    }
//    In an array 'a' move all even integers at the beginning followed by all odd integers
static void sortedEvenAndOdd(int[] arr)
{
//    “No, it’s not stable. Stability can be achieved using extra space, but this approach optimizes for time and space.”
    int n = arr.length;
    int i=0, j=n-1;

    while(i<j){
        if(arr[i]%2 != 0 && arr[j]%2 == 0){
            swap(arr, i, j);
            i++;
            j--;

        }
        if(arr[i]%2 == 0){
            i++;
        }
        if(arr[j]%2 != 0){
            j--;
        }
    }
}
    //Basic approach
//    static void sortedZeroOne(int[] arr){
//        int count =0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == 0){
//                count++;
//            }
//        }
//        for(int i=0; i<arr.length; i++){
//            if(i< count){
//                arr[i] =0;
//            }else{
//                arr[i] =1;
//            }
//        }
//
//    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        sortedZeroOne(arr);
        sortedEvenAndOdd(arr);
        System.out.println("Sorted Even & Odd Array");
        printArray(arr);


    }
}
