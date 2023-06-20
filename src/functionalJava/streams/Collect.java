package functionalJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {

        String[] wordArr = {"hello", "functional", "programming", "is", "cool"};
        List<String> wordsList = new ArrayList<>(Arrays.asList(wordArr));

        Long words = wordsList
                .stream()
//                .collect(Collectors.toList());
//                .collect(Collectors.toSet());
//                .collect(Collectors.joining("* "));
                .collect(Collectors.counting());
        //many, key(length) value map
//                .collect(Collectors.groupingBy(
//                        (word) -> word.length()
//                ));
        //2, key true and second key false
//                .collect(Collectors.partitioningBy(
//                        (word) -> word.length() > 5
//                ));

        System.out.println(words);
    }
}
