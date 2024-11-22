package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.sql.Time;
import java.util.Scanner;

public class Timeconversion {
        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            // Write your code here

            if((s.charAt(8)=='P')||(s.charAt(8)=='p')){
                String substring=s.substring(0,8);
                String[] times=substring.split(":");
               if(times[0].equals("12")){
                   return times[0]+":"+times[1]+":"+times[2];

               }
               int conversion=(Integer.parseInt(times[0])+12);
               times[0]=Integer.toString(conversion);
                return times[0]+":"+times[1]+":"+times[2];

            }
            else  {

                String substring=s.substring(0,8);
                String[] times=substring.split(":");
                if(times[0].equals("12")){
                    times[0]="00";
                    return times[0]+":"+times[1]+":"+times[2];

                }
            }
            return s.substring(0,8);

        }



        public static void main(String[] args) throws Exception {
           Scanner scan=new Scanner(System.in);
           String s=scan.next();
            System.out.println(timeConversion(s));
            scan.close();
        }


}
