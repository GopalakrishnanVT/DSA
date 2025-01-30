package DSA.recursion;

import java.util.Stack;

public class BalanceStringStack {

    public static void main(String[] args) {

        String str = "(2+)[{4]}";
        System.out.println(stringBalance(str));

    }

    private static boolean stringBalance(String str) {
        Stack<Character> mainStack = new Stack<Character>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '{' || ch[i] == '[' || ch[i] == '(') {
                mainStack.push(ch[i]);
            }

            if (ch[i] == '}' || ch[i] == ']' || ch[i] == ')') {
                char ch1 = mainStack.pop();

                if ((ch1 == '(' && ch[i] != ')') || (ch1 == '{' && ch[i] != '}') || (ch1 == '[' && ch[i] != ']'))

                    return false;

            }

        }
        return mainStack.isEmpty();
    }

}
