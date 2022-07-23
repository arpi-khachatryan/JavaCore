package chapters.chapter14;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("T տիպի համարվում է: " + ob.getClass().getName());
    }
}
