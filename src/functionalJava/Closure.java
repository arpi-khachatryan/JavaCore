package functionalJava;

public class Closure {

    public static void main(String[] args) {

        NoArgFunction<NoArgFunction<String>> createFGreeter = () -> {
            String name = "Ann";
            return () -> "Hello, " + name;
        };

        NoArgFunction<String> greeter = createFGreeter.apply();
        System.out.println(greeter.apply());
    }
}
