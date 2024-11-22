package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Median {
    public static int findMedian(int[] arr) {
        // Write your code here
        int median=0;
        //int size=arr.length;
        //int temp=0;
        /*for(int i=0;i<size;i++){
            for(int j=1+i;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }*/ // The above method gives perf issue
        Arrays.sort(arr);
            int a=arr.length/2;
            median= arr[a];
        return median;
        }



    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=scan.nextInt();

       }
        System.out.println(findMedian(arr));
        scan.close();
    }


}
