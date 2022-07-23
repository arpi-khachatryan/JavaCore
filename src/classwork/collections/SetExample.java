package classwork.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("a");
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
