package chapters.chapter7.overload;

public class Overload {
    void test() {
        System.out.println("Պարամետրերը բացակայում են");
    }

    void test(int a) {
        System.out.println("int a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a & b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
