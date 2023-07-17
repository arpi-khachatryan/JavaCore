package classwork.patterns.iterator.iterator2;

public class Main {
    public static void main(String[] args) {

        NameCollection nameCollection = new NameCollection();
        nameCollection.addName("John");
        nameCollection.addName("Jane");
        nameCollection.addName("David");

        Iterator<String> iterator = nameCollection.getIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
