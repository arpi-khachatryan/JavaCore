package chapters.chapter8.override;

public class OverloadA {
    int i, j;

    OverloadA(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println(i + " " + j);
    }
}
