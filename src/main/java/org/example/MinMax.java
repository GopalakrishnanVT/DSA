package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MinMax {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        int size=arr.size();
        long sum[]=new long[size];
        long temp=0;
        long sumvalu=0;
        for(int i=0;i<size;i++){

            sumvalu+=arr.get(i);

        }
        for(int j=0;j<size;j++){
            sum[j]=sumvalu- arr.get(j);

        }

        for(int i=0;i<sum.length;i++){
            for(int j=1+i;j<sum.length;j++){
                if(sum[i]>sum[j]){
                    temp=sum[i];
                    sum[i]=sum[j];
                    sum[j]=temp;

                }
            }

        }
        System.out.println(sum[0]);
        System.out.println(sum[sum.length-1]);

    }



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }
}
