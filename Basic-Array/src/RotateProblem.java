import java.util.Scanner;

public class RotateProblem {

    static int[] rotateinPlace(int[] arr, int k){
        int n = arr.length;
        k=k%n;

        reverse(arr, 0,n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

        return arr;
    }

    static int[] reverse(int[] arr,int i, int j){
        while(i<j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    static int[] rotatearray(int[] arr, int k){
        int n = arr.length;
        k= k%n;
        int j=0;
        int[] ans = new int[n];

        for(int i= n-k; i<= n-1; i++){
            ans[j++] = arr[i];

        }
        for(int i=0; i<n-k; i++){
            ans[j++]=arr[i];

        }

        return ans;
    }

    static void printArray(int[] arr){
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter kth value for rotate array: ");
        int k = sc.nextInt();

//        int[] ans = rotatearray(arr,k);


        int[] ans = rotateinPlace(arr,k);
        printArray(ans);

    }
}
