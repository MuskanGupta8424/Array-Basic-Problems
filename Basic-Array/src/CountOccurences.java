import java.util.Scanner;

//Find count occurence of an element x in a given array

public class CountOccurences {
    static int getCountOccurence(int[] arr, int x){
        //arr = [1,2,3,4,4,5]
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input for length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Value of x is ");
        int x = sc.nextInt();

        System.out.println("Count occurences value is " +  getCountOccurence(arr,x));

    }
}
