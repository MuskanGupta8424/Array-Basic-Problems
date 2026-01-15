import java.util.Scanner;

public class SecondLargest {
    // 3,5,6,4,6
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;//-infinite
        int n= arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]> mx){
                mx=arr[i];
            }
        }
        return mx;

    }
    static int secondMax(int[] arr){
        int max = findMax(arr);
//        System.out.println("mx" + max);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == max){
                arr[i] =Integer.MIN_VALUE; //-infinite value
            }
        }

        int secondmax = findMax(arr);
//        System.out.println("mx" + secondmax);

        return secondmax;
    }
    public static  void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of an array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }

        System.out.println( "Find Second Max value" + secondMax(arr));
    }
}
