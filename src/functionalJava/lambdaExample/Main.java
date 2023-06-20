package functionalJava.lambdaExample;

public class Main {

    public static void main(String[] args) {

        GreetingMessage greetingMessage = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        greetingMessage.greet("Ann");


        GreetingMessage greetingMessage1 = (String name) -> {
            System.out.println("Hello " + name);
        };
        greetingMessage1.greet("Ann");


        MessagePrinter messagePrinter = () -> {
            System.out.println("This is a message");
        };
        messagePrinter.printMessage();
    }
}
