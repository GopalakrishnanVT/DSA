package DSA.recursion;

public class Factorial {
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;

        }
        else{
        int factSum=factorial(n-1)+factorial(n-2);
        return factSum;
        }
    }
    public static void main(String[] args) {
       for(int i=0;i<=7;i++){

           System.out.println(factorial(i));
       }

    }
}
