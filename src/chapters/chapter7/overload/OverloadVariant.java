package chapters.chapter7.overload;

public class OverloadVariant {

    void test() {
        System.out.println("Պարամետրերը բացակայում են");
    }

    void test(int a, int b) {
        System.out.println("a & b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("double a: " + a);
    }
}
