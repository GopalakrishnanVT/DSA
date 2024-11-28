package DSA.recursion;

public class Fibonacci {
    static int fib(int n){
        if(n==1||n==0){
            return 1;

        }
        int sum=n*(fib(n-1));
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fib(5));

    }
}
