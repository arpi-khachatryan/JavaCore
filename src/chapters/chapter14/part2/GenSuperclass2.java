package chapters.chapter14.part2;

public class GenSuperclass2<T> {
    T ob;

    GenSuperclass2(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class Gen3<T, V> extends GenSuperclass2<T> {
    V ob2;

    Gen3(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2() {
        return ob2;
    }
}

class HierDemo {
    public static void main(String[] args) {
        Gen3<String, Integer> x = new Gen3<>("Gen", 100);
        System.out.println(x.getOb());
        System.out.println(x.getOb2());
    }
}