package chapters.chapter14;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        iOb.showType();
        int v = iOb.getob();
        System.out.println(v);

        System.out.println();

        Gen<String> strOb = new Gen<>("Generic");
        strOb.showType();
        String str = strOb.getob();
        System.out.println(str);
    }
}
