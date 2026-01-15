import java.util.Scanner;

public class TripletSum {
//    Program to count the number of triplets whose sum is equal to the given value x
    static int tripletSum(int[] arr,int target){
        int ans =0;
        int n = arr.length;
        for(int i= 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n ; k++){
                    if(arr[i]+ arr[j]+arr[k] == target){
                        ans++;
                        break;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //size of an array
        System.out.println("Enter the size of an array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of an array :");

        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        System.out.println("Triplet Sum count : " + tripletSum(arr, target));

    }
}
