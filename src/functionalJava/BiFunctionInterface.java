package functionalJava;

import java.util.function.BiFunction;

public class BiFunctionInterface {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(11, 22));

        TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x + y * z;
        System.out.println(addThree.apply(8, 2, 3));

        NoArgFunction<String> sayHello = () -> "Hello";
        System.out.println(sayHello.apply());
    }
}