package functionalJava.streams;

import java.util.Arrays;

public class Name {

    public static void main(String[] args) {

        String[] names = {"Ann", "Aram", "Hayk", "Nare", "Edgar"};
        Arrays.stream(names).filter(name -> {
            return name.startsWith("A");
        }).forEach(System.out::println);
    }
}
