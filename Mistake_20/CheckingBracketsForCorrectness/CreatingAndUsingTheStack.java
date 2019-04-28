package Homework_20.CheckingBracketsForCorrectness;

import java.util.Arrays;

public class CreatingAndUsingTheStack {
    public static void main(String[] args) {
        Stack stack1 = new Stack(10);
        stack1.pop();
        stack1.push('a');
        stack1.push('b');
        stack1.push('c');
        stack1.push('n');
        stack1.push('r');
        System.out.println(stack1.isEmpty());
        System.out.println(Arrays.toString(stack1.TheOutPutStack()));
    }
}

class Stack {
    private int MaxSize;
    private char[] stackArrays;
    private int top;
    private boolean check;

    Stack(int s) {
        MaxSize = s;
        stackArrays = new char[MaxSize];
        top = -1;
    }

    public void push(char j){
        stackArrays[++top] = j;
    }

    public char pop() {
        isEmpty();
        if (check) {
            System.out.println("You cannot do this action because the stack is full.");
        }
        else {
            return stackArrays[top--];
        }
        return 0;
    }

    public boolean isEmpty() {
        check = (top == -1);
        return check;
    }

    public char[] TheOutPutStack () {
        char[] AllTheseChars = new char[top+1];
        for (int i = 0; i <= top; i++) {
            AllTheseChars[i] = stackArrays[top - i];
        }
        return AllTheseChars;
        }


    public char peek() {
        return stackArrays[top];
    }
}
