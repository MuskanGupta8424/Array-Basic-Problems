import java.util.Scanner;

public class PresentQuery {
//Given Q queries, check if the given number  is present in the array or not
//    Note: Value of all the elements in the array is less than  10 to the power 5.
    static int[] makeFrequencyArr(int[] arr){
        int[] freq = new int[100005];
        for(int i=0; i<arr.length; i++){
        freq[arr[i]]++;//freq[arr[i]= freq[arr[i]] +1;
        }
        return freq;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n =sc.nextInt();
        System.out.println("Enter the element of an array: ");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of query: ");
        int q = sc.nextInt();

        int[] freq = makeFrequencyArr(arr);

        while(q>0){
            System.out.println("Enter number to be searched:");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            q--;
        }
    }

}
