package chapters.chapter8.override;

public class OverloadDemo {
    public static void main(String[] args) {
        OverloadB b = new OverloadB(1, 2, 3);

        b.show("This is k: ");
        b.show();
    }
}
