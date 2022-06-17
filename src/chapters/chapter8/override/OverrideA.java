package chapters.chapter8.override;

public class OverrideA {
    int i, j;

    OverrideA(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println(i + " " + j);
    }
}
