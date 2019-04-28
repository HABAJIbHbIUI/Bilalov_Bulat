package Homework_20.ImplementationBasedOnALinkedList;

public class Stack<Item> {
    private Node first;
    private Node last;
    private int N;

    private class Node<Item> {
        Item item;
        Node next;
    }


    public boolean isEmpty(){
        return  first == null;
    }

    public int size(){
        return N;
    }

    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }
    public Item pop(){
        Item item = (Item) first.item;
        first = first.next;
        N--;
        return item;
    }
}

class Main {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push('g');
    }
}
