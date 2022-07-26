package chapters.chapter14.part3;

public class GenIof<T> {
    T ob;

    GenIof(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class GenIof2<T> extends GenIof<T> {
    GenIof2(T o) {
        super(o);
    }
}

class HierDemo2 {
    public static void main(String[] args) {
        GenIof<Integer> iOb = new GenIof<>(88);
        GenIof2<Integer> iOb2 = new GenIof2<>(99);
        GenIof2<String> strOb2 = new GenIof2<>("Test");

        if (iOb2 instanceof GenIof2<?>) {
            System.out.println(true);
        }
        if (iOb2 instanceof GenIof<?>) {
            System.out.println(true);
        }

        System.out.println();
        if (strOb2 instanceof GenIof2<?>) {
            System.out.println(true);
        }
        if (strOb2 instanceof GenIof<?>) {
            System.out.println(true);
        }

        System.out.println();
        if (iOb instanceof GenIof2<?>) {
            System.out.println(true);
        }
        if (iOb instanceof GenIof<?>) {
            System.out.println(true);
        }
    }
}
