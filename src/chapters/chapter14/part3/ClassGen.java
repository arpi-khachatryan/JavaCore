package chapters.chapter14.part3;

public class ClassGen<T> {
    T ob;

    ClassGen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}

class ClassGen2<T> extends ClassGen<T> {
    ClassGen2(T o) {
        super(o);
    }

    T getob() {
        return ob;
    }
}

class OverrideDemo {
    public static void main(String[] args) {
        ClassGen<Integer> iOb = new ClassGen<>(88);
        ClassGen2<Integer> iOb2 = new ClassGen2<>(99);
        ClassGen2<String> strOb = new ClassGen2<>("Gen");
        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb.getob());
    }
}
