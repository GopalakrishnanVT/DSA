package DSA.recursion;

import java.util.Stack;

public class StacksSorting {

    public static void main(String[] args) {
        Stack<Integer> mainStack=new Stack<Integer>();
        mainStack.push(23);
        mainStack.push(24);
        mainStack.push(2);
        mainStack.push(1);
        minValueStack(mainStack);

    }

    private static void minValueStack(Stack<Integer> mainStack) {
        Stack<Integer> tempStack=new Stack<Integer>();
        while(!mainStack.empty()){
            int tempVal=mainStack.pop();
            if(tempStack.empty()){
                tempStack.push(tempVal);

            } else if (tempStack.peek()>tempVal) {
                int tempStackVal=tempStack.pop();
                tempStack.push(tempVal);
                mainStack.push(tempStackVal);
            }
            else {
                tempStack.push(tempVal);
            }


        }
        System.out.println(tempStack);

    }

}
