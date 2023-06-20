package functionalJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
        //Predicate: true or false
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        List<Integer> event = listOfIntegers
                .stream()
                .filter(isEven)
                .collect(Collectors.toList());
        System.out.println(event);


        List<Integer> event2 = listOfIntegers
                .stream()
                .filter((x) -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(event2);


        String[] wordArr = {"hello", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordArr));

        Predicate<String> isLongerThan5 = (str) -> str.length() > 5;
        List<String> longerWords = words
                .stream()
                .filter(isLongerThan5)
                .collect(Collectors.toList());
        System.out.println(longerWords);


        Function<Integer, Predicate<String>> createLengthTest = (minLength) -> {
            return (str) -> str.length() > minLength;
        };

        Predicate<String> isLongerThan3 = createLengthTest.apply(3);

        List<String> longWords = words
                .stream()
//                .filter(createLengthTest.apply(3))
                .filter(isLongerThan3)
                .collect(Collectors.toList());
        System.out.println(longWords);
    }
}
