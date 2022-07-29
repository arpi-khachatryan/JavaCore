package homework.collections;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("ArrayList");
        strList.add("LinkedList");
        strList.add("Vector");
        strList.add("Stack");
        strList.add("HashSet");
        strList.add("LinkedHashSet");
        strList.add("TreeSet");

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(9);
        intList.add(8);

        System.out.println(arrayToList(new String[]{"ArrayList", "LinkedList", "Vector"}));
        System.out.println(removeById(strList, 1));
        System.out.println(listToSet(strList));
        System.out.println(listToLinkedList(intList));
        System.out.println(reverseNumbers(intList));
        printFirstFive(strList);
        System.out.println(sizeOfList(strList));
    }

    static List<String> arrayToList(String[] values) {
        return Arrays.asList(values);
    }

    static List<String> removeById(List<String> list, int index) {
        list.remove(index);
        return list;
    }

    static Set<String> listToSet(List<String> list) {
        return new HashSet<>(list);
    }

    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        return new LinkedList<>(list);
    }

    static List<Integer> reverseNumbers(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }

    static void printFirstFive(List<String> list) {
        if (list.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                System.out.println(list.get(i));
            }
        } else {
            System.out.println(list);
        }
    }

    static int sizeOfList(List<String> list) {
        return list.size();
    }
}