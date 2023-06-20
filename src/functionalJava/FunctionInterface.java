package functionalJava;

import java.util.function.Function;

public class FunctionInterface {

    protected static class MyMath {
        public static Integer triple(Integer x) {
            return x * 3;
        }
    }

    public static void main(String[] args) {
        Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(2);
        System.out.println(result);
    }
}
