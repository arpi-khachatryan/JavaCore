package classwork.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(111, "Poghos");
        namesMap.put(222, "Petros");

        String s = namesMap.get(111);
        System.out.println(s);
        String c = namesMap.get(444);
        System.out.println(c);

        Collection<String> values = namesMap.values();
        for (String value : values) {
            System.out.println(value);
        }

        Set<Integer> integers = namesMap.keySet();
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println();
        Set<Map.Entry<Integer, String>> entries = namesMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}
