import java.util.Scanner;

public class MultiDimentionalArray {
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {5,6,4}
//        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row:");
        int row = sc.nextInt();
        System.out.println("Enter column:");
        int col = sc.nextInt();

        int[][] arr2= new int[row][col];
        System.out.println("Enter elements of an MultiDimension array: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        printArray(arr2);
    }
}
