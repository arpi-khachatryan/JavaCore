package chapters.chapter8;

public class B/*subclass*/ extends A /*superclass*/ {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}
