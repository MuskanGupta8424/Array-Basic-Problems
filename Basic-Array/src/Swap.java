public class Swap {
    static void swapvalue(int a, int b){
        System.out.println("a: "+ a+ " b: " + b);
        int temp= a;
        a=b;
        b=temp;

        System.out.println("after swap value of a= "+ a + " value of b= "+ b);
    }

    static void swapwithoutUsingExtraSpace(int a, int b){
        System.out.println("Without using extra space : \n");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap a: "+ a);
        System.out.println("after swap b: "+ b);
    }

    public static void main(String[] args ){
        int a=9;
        int b=3;
        swapvalue(a,b);
        swapwithoutUsingExtraSpace(a,b);
    }
}

