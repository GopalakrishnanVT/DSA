package DSA.recursion;

import java.util.Arrays;

public class Selectionsort {

    public static void main(String[] args) {
        int[] arr={4,1,2,7,9,3};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j]<=arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
