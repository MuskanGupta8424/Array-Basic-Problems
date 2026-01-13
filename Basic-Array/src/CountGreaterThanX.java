import java.util.Scanner;

public class CountGreaterThanX {
//    Program to count the number of elements strictly greater than a value of x
    static int getcountgreaterThanX(int [] arr,int x){
//  x >arr[i] count =0;      [1,4,5,5,5,8]
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");

        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array is ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x is ");
        int x = sc.nextInt();
        System.out.println("Count the number of elements strcictly greater than a value of x is " +getcountgreaterThanX(arr,x));

    }
}
