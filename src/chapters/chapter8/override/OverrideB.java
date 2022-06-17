package chapters.chapter8.override;

public class OverrideB extends OverrideA {
    int k;

    OverrideB(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
