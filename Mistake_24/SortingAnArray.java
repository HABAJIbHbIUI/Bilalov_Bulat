package Homework_24;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(50);
        arrayList.add(47);
        arrayList.add(49);
        arrayList.add(48);
        arrayList.add(46);
        arrayList.add(45);
        Collections.sort(arrayList);
        System.out.println("Отсортированные массив по возрастанию: " + arrayList);
        arrayList.sort((o1, o2) -> {
            int x = o1;
            int y = o2;
            return Integer.compare(y, x);
        });
        System.out.println("Отсортированный массив по убыванию: " + arrayList);
    }
}
