package functionalJava.lambdaExample;

@FunctionalInterface
public interface GreetingMessage {

    public abstract void greet(String name);
}
