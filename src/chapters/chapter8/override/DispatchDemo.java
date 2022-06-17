package chapters.chapter8.override;

public class DispatchDemo {
    public static void main(String[] args) {
        DispatchA a = new DispatchA();
        DispatchB b = new DispatchB();
        DispatchC c = new DispatchC();

        DispatchA r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
