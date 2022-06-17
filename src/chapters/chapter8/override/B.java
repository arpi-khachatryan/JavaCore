package chapters.chapter8.override;

public class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        //or super.show();, որպեսզի override չլինի
        System.out.println(k);
    }
}
