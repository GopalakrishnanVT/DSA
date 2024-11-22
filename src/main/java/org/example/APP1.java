package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class APP1
{
    final static String SPLIT = "S";
    final static String COMBINE = "C";
    final static String METHOD = "M";
    final static String CLASS = "C";
    final static String VARIABLE = "V";

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String entry = scanner.nextLine();
            String[] arrValues = entry.split(";");
            List<String> list = new ArrayList<>();

            list = Arrays.asList(arrValues);

            String operation = list.get(0);
            String type = list.get(1);
            String name = list.get(2);

            if (SPLIT.equals(operation)) {

                if (METHOD.equals(type)) {
                    name = name.replace("()", "");
                }


                String[] splString = name.split("((?=[A-Z]))");

                StringBuilder sb = new StringBuilder();
                for (String value : splString) {
                    sb.append(value).append(" ");
                }

                System.out.println(sb.toString().toLowerCase());
            }

            if (COMBINE.equals(operation)) {
                String[] splString = name.split(" ");
                int startIndex = 1;

                if (CLASS.equals(type)) {
                    startIndex = 0;
                }

                for (int i = startIndex; i < splString.length; i++) {
                    splString[i] = splString[i].substring(0, 1).toUpperCase()
                            + splString[i].substring(1);
                }

                StringBuilder sb = new StringBuilder();
                for (String value : splString) {
                    sb.append(value);
                }

                if (METHOD.equals(type)) {
                    sb.append("()");
                }

                System.out.println(sb.toString());
            }
        }
    }
}
