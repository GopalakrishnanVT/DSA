
package DSA.recursion;

import java.util.Scanner;

public class Recursion {
    static int sumArray(int n){
        int[] arr={1,2,4,7,8,9};
        if(n==0){
            return arr[n];
        }

        int sum=arr[n]+sumArray(n-1);

        return sum;
    }
    public static void main(String[] args) {
        int n=5;

      System.out.println(sumArray(n));

    }
}
