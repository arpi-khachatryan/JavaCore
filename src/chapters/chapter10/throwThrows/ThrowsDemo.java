package chapters.chapter10.throwThrows;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("throwOne() մեթոդի մարմնում");
        throw new IllegalAccessException();
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }
    }
}
