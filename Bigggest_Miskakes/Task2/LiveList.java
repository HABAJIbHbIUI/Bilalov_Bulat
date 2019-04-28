package Bigggest_Miskakes.Task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LiveList {
    private List<MyLive> list;

    public LiveList() {
        list = new ArrayList<>();
    }

    public void addMyLive(MyLive myLive) {
        list.add(myLive);
    }

    public List<MyLive> top10(int n, Comparator<MyLive> comparator) {
        if (n > list.size()) throw new IllegalArgumentException("IndexOutOfBound");
        List<MyLive> lives = new ArrayList<>();
        list.sort(comparator);
        for (int i = 0; i < n; i++) {
            lives.add(list.get(i));
        }
        return lives;
    }
}
