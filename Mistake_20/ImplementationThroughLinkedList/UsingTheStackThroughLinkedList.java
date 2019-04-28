package Homework_20.ImplementationThroughLinkedList;

import java.util.LinkedList;

public class UsingTheStackThroughLinkedList {
    public static void main(String[] args) {
        StackImplementationForLinkedList stack1 = new StackImplementationForLinkedList();
        stack1.push('d');
        stack1.push('e');
        stack1.push('f');
        stack1.push('g');
        stack1.peek();
        boolean b = stack1.isEmpty();
        System.out.println(b);
        System.out.println(stack1.toString());
    }
}
class StackImplementationForLinkedList <T> {
     private final LinkedList<T> list = new LinkedList<>();

    void push(T j) {
        list.addFirst(j);
    }

    void pop() {
         list.removeFirst();
    }

    public T peek() {
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString () {
        return list.toString();
    }
}



