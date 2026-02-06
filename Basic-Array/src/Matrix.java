import java.util.Scanner;

public class Matrix {
    static void printMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void multiply(int[][] arr, int r1,int c1, int[][] arr2, int r2, int c2){
        if(c1 !=  r2){
            System.out.println("Wrong input --- Multiplication not possible");
            return;
        }
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){

            }
        }
    }
    static void add(int[][] arr, int r1,int c1, int[][] arr2, int r2, int c2 ){
        if((r1 != r2) || (c1 != c2)){
            System.out.println("Wrong input ----  Addition not possible");
            return;
        }
        int[][] sum =new int[r1][c1];

        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                sum[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        printMatrix(sum);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter row1");
        int r1 = sc.nextInt();
        System.out.println("Enter col1");
        int c1 = sc.nextInt();
        int[][] arr=new int[r1][c1];
        System.out.println("Enter Matrix 1");
        for(int i=0; i<r1; i++){
           for(int j=0; j<c1; j++){
               arr[i][j] = sc.nextInt();
           }
        }

        System.out.println("Enter row2");
        int r2 = sc.nextInt();
        System.out.println("Enter col2");
        int c2 = sc.nextInt();
        int[][] arr2=new int[r2][c2];
        System.out.println("Enter Matrix 2");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        add(arr,r1,c1,arr2,r2,c2);



    }
}
