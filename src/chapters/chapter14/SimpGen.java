package chapters.chapter14;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen = new TwoGen<>(11, "Generic");
        twoGen.showTypes();

        int v = twoGen.getOb1();
        String str = twoGen.getOb2();
        System.out.println(v);
        System.out.println(str);
    }
}
