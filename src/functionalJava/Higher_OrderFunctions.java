package functionalJava;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Higher_OrderFunctions {

    public static void main(String[] args) {

        BiFunction<Float, Float, Float> divide =
//                (x, y) -> x / y;
                (x, y) -> {
                    if (y == 0f) {
                        System.out.println("Error: Can not divide by zero.");
                        return 0f;
                    }
                    return x / y;
                };


        BiFunction<Float, Float, Float> divide2 = (x, y) -> x / y;

        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsNotZeroCheck =
                (func) -> (x, y) -> {
                    if (y == 0f) {
                        System.out.println("Error: second argument is zero!");
                        return 0f;
                    }
                    return func.apply(x, y);
                };

        BiFunction<Float, Float, Float> divideSafe = secondArgIsNotZeroCheck.apply(divide2);
        System.out.println(divideSafe.apply(10f, 2f));
    }
}