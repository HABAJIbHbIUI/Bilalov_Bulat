package Homework_21.ImplementAQueue;

public class Queue<T> {
    private Node<T> first;
    private Node<T> last;

    void enqueue(T elem) {
        Node <T> oldlast = last;
        last = new Node<>();
        last.item = elem;
        if (first == null) {
            first = last;
        } else {
            oldlast.next = last;
        }
    }

    boolean isEmpty() {
        return first == null;
    }

    public T dequeue() {
        T item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return item; 
    }
    
    class Node<Item> {
        Item item; /* Парамеиризованный тип. Представляет собой заполнитель
    для любого типа данных, которые понадобилось структурировать в виде связного списка */
        Node <Item> next;
    }
}

class Main {
    public static void main(String[] args) {
        Queue<Character> queue1 = new Queue<>();
        Queue queue2 = new Queue();
        Queue queue3 = new Queue();
        queue1.enqueue('g');
        System.out.println(queue1.dequeue());
//        queue2.dequeue();
    }
}

