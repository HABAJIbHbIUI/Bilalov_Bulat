package Homework_31;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

class GenericLinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private int count = 0;

    public Stream<T> stream() {
        return new MyStream<>(this);
    }

    public int size() {
        return count;
    }

    //добавление в конец
    public void add(T e) {
        Node<T> newNode = new Node<>();
        newNode.setValue(e);
        newNode.setNext(null);
        if (head != null) {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        } else {
            head = newNode;
        }
        count++;
    }

    public boolean contains(T value) {
        if (head == null) return false;
        Node<T> current = head;
        while (current != null) {
            if (current.getValue() == value) return true;
            current = current.getNext();
        }
        return false;
    }

    public T[] toArray() {
        T[] array = (T[]) new Object[count];
        Node<T> current = head;
        for (int i = 0; i < count; i++) {
            array[i] = current.getValue();
            current = current.getNext();
        }
        return array;
    }

    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + " вне границ");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public void addAll(GenericLinkedList<T> myLinkedList) {
        T[] arr = myLinkedList.toArray();
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }

    public void addFromIndex(GenericLinkedList<T> myLinkedList, int index) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Index: " + index + " вне границ");
        }
        if (index == count) {
            addAll(myLinkedList);
            return;
        }
        T[] arr = myLinkedList.toArray();


        Node<T> curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.getNext();
        }

        Node<T> next = curr.getNext();

        for (int i = 0; i < arr.length; i++) {
            Node<T> newnode = new Node<>();
            newnode.setValue(arr[i]);
            curr.setNext(newnode);
            curr = curr.getNext();
            count++;
        }
        curr.setNext(next);
    }


    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + " вне границ");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node<T> beforeRemovable = head;
            for (int i = 0; i < index - 1; i++) {
                beforeRemovable = beforeRemovable.getNext();
            }
            Node<T> nodeToRemove = beforeRemovable.getNext();
            beforeRemovable.setNext(nodeToRemove.getNext());
        }
        count--;
    }

    public Iterator<T> iterator() {
        return new MyIter();
    }

    public class MyIter implements Iterator<T> {
        private Node<T> currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            T next = currentNode.getValue();
            currentNode = currentNode.getNext();
            return next;
        }
    }
}
