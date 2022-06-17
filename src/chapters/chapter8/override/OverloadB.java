package chapters.chapter8.override;

public class OverloadB extends OverloadA {
    int k;

    OverloadB(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
