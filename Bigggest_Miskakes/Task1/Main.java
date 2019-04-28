package Bigggest_Miskakes.Task1;

import java.io.File;
import java.util.function.Predicate;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(getWords(s -> s.length()>1).toString());
    }

    private static List<String> getWords(Predicate<String> predicate) throws FileNotFoundException {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(new File("src/task01/text.txt"));
        while (sc.hasNext()) {
            String next = sc.next();
            if (predicate.test(next)) {
                map.put(next, map.get(next) == null ? 1 : map.get(next)+1);
            }
        }
        List<Map.Entry<String, Integer>> entryArrayList = new ArrayList<>(map.entrySet());
        entryArrayList.sort((o1, o2) -> o2.getValue() - o1.getValue());
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: entryArrayList) {
            list.add(entry.getKey());
        }
        return list;
    }
}
