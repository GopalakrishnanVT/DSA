package DSA.recursion;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(23);
        stack.push(24);
        stack.push(25);
        stack.push(26);
        Stack<Integer> stack1=new Stack<Integer>();
        Stack<Integer> stack2=new Stack<Integer>();
        System.out.println(stack);
       /* moveStack(stack,stack1);
        moveStack(stack1,stack2);
        moveStack(stack2,stack);*/
        //System.out.println(stack);
        insertValueAtIndex(stack,0,30);
        System.out.println(stack);

    }
    private static void moveStack(Stack<Integer> source, Stack<Integer> des) {
        while (!source.empty()){
            des.push(source.peek());
            source.pop();
        }
    }

   private static void insertValueAtIndex(Stack<Integer> source,int desIndex,int val){

        Stack<Integer> temp=new Stack<Integer>();

       int i=source.size();
       while (i>desIndex){
           temp.push(source.peek());
           source.pop();
           i--;
       }
        source.push(val);
       while(!temp.empty()){
           source.push(temp.peek());
           temp.pop();

       }

    }

}
