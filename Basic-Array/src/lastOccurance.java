import java.util.Scanner;

//Find last occurence of an element x in a given array
public class lastOccurance {
    static int getlastOccurance(int[] arr,int x){
        int lastIndex=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== x){
                lastIndex =i;
            }

        }
        return lastIndex;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ENter value of x ");
        int x = sc.nextInt();
        System.out.println("Last Occurences in array is "+ getlastOccurance(arr, x));
    }
}
