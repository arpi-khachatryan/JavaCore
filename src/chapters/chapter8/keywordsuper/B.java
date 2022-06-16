package chapters.chapter8.keywordsuper;

public class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i from superclass: " + super.i);
        System.out.println("i from subclass: " + i);
    }
}
