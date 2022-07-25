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
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            arrayList.add(values[i]);
        }
        return arrayList;
    }

    static List<String> removeById(List<String> list, int index) {
        list.remove(index);
        return list;
    }

    static Set<String> listToSet(List<String> list) {
        Set<String> strList = new HashSet<>();
        strList.addAll(list);
        return strList;
    }

    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        LinkedList<Integer> listInt = new LinkedList<>();
        listInt.addAll(list);
        return listInt;
    }

    static List<Integer> reverseNumbers(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }

    static void printFirstFive(List<String> list) {
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }

    static int sizeOfList(List<String> list) {
        return list.size();
    }
}