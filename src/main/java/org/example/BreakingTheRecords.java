package org.example;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingTheRecords {
    static int[] breakingRecords(int[] scores) {
        int min =0;
        int max=0;
        int maxV=scores[0];
        int minV=scores[0];
        for(int i=0;i<scores.length;i++){
            if(scores[i]<minV){
                minV=scores[i];
                min++;

            }
            if(scores[i]>maxV){
                maxV=scores[i];
                max++;

            }

        }
        int [] result=new int[2];
        result[0]=max;
        result[1]=min;

    return  result;
    }




    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        //Scanner scanner1 = new Scanner(System.in);

        System.out.println(System.getenv(""));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];
        System.out.println("size of array "+n);

        /*String[] scoresItems = scanner1.nextLine().split(" ");
        scanner1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");*/

        for(int i=0;i<scores.length;i++){
            int scoresItems=scanner.nextInt();
            scores[i]=scoresItems;

        }
       /* for (int i = 0; i < n; i++) {
            int scoresItem =(scoresItems[i]);
            scores[i] = scoresItem;
        }*/

       int result[]=breakingRecords(scores);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("JAVA_HOME"));
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
