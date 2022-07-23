package classwork.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Iterable");
        print(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Collections");
        print(linkedList);
    }

    public static void print(List<String> items) {
        for (String item : items) {
            System.out.println(item);
        }
    }
}
//    public static void print(List<?> items) {
//        for (Object item : items) {
//            System.out.println(item);
//        }