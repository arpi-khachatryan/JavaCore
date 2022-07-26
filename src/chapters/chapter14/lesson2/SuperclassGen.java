package chapters.chapter14.lesson2;

public class SuperclassGen<T> {
    T ob;

    SuperclassGen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class Gen2<T> extends SuperclassGen<T> {
    Gen2(T o) {
        super(o);
    }

    public static void main(String[] args) {
        Gen2<Integer> num = new Gen2<>(100);
    }
}

