package chapters.chapter14;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats2<Integer> iOb = new Stats2<>(inums);
        double v = iOb.average();
        System.out.println(v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats2<Double> dOb = new Stats2<>(dnums);
        double w = dOb.average();
        System.out.println(w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats2<Float> fOb = new Stats2<>(fnums);
        double fx = fOb.average();
        System.out.println(fx);

        if (iOb.sameAvg(dOb)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (iOb.sameAvg(fOb)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
