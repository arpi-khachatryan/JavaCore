package chapters.chapter14.part2;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}

class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen<String> strOb = new Gen<>("oo");
        System.out.println(iOb.getob());
        System.out.println(strOb.getob());

        Gen raw = new Gen(99.88);
        double d = (Double) raw.getob();
        System.out.println(d);
    }
}
