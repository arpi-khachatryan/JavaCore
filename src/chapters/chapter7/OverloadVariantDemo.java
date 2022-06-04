package chapters.chapter7;

public class OverloadVariantDemo {
    public static void main(String[] args) {
        OverloadVariant ov = new OverloadVariant();
        int i = 88;

        ov.test();
        ov.test(10, 20);
        ov.test(i);
        ov.test(123.2);
    }
}
