package chapters.chapter14.lesson2;

public class GenCons {
    private double val;

    <T extends Number> GenCons(T args) {
        val = args.doubleValue();
    }

    void showVal() {
        System.out.println("val: " + val);
    }


    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(100.5F);

        test.showVal();
        test2.showVal();
    }
}
