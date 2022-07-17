package chapters.chapter7.overload;

public class Overload {
    void test() {
        System.out.println("Պարամետրերը բացակայում են");
    }

    void test(int a) {
        System.out.println("int aa.txt: " + a);
    }

    void test(int a, int b) {
        System.out.println("aa.txt & b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double aa.txt: " + a);
        return a * a;
    }
}
