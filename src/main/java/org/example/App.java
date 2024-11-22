package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String str="LargeSoftwareBook";
        String[] arr=str.split("");
       // List<String> lis= new LinkedList<String>(Collections.singleton(str));
        //System.out.println(lis);
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(Character.isUpperCase(str.charAt(i))){
                k++;
            }
        }
        String[] arr1=new String[arr.length+k];
        for(int i=0;i<arr1.length;i++){

            if(arr1[i].equals("[^abc]")){
               char tolowercase=Character.toLowerCase(str.charAt(i));
               if(i==0){
                   arr1[i]=Character.toString(tolowercase);
               }
               else{
               arr1[i-1]=" ";
                arr1[i]=Character.toString(tolowercase);
               }
            }
        }
        for (String s:arr1) {
            System.out.println(s);
        }

    }
}
