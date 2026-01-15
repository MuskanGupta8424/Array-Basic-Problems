import java.util.Scanner;

public class FirstRepeatingNumber {
    // 3,5,4,3,4,5
//    For an array of integers return the first value that is repeating in the array if no value is being repeated return -1
    static int firstRepeatingNumber(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n ; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elemnets of an array: ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Find First Repeting Value in an array: " + firstRepeatingNumber(arr));
    }
}
