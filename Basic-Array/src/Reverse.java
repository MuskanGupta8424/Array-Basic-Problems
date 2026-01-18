import java.util.Scanner;

public class Reverse {
    static int[] reverseArray(int[] arr){
        int j=0;
        int n=arr.length; //1,2,3,4,5
        int[] ans =new int[n];
        for(int i=n-1; i>=0; i--){
                ans[j++] = arr[i];
        }
        return ans;
    }

    static int[] reverseArrayWithoutUsingExtraSpace(int[] arr){
        int i=0; int j=arr.length-1;
        while(i<j){
            int temp = arr[i];//12
            arr[i]= arr[j];//
            arr[j] =temp;
             i++;
             j--;
        }
      return arr;
    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
//        int[] ans = reverseArray(arr);
      int[] ans=   reverseArrayWithoutUsingExtraSpace(arr);

      printArray(ans);

    }
}
