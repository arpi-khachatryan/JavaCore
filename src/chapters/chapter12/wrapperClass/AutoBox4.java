package chapters.chapter12.wrapperClass;

public class AutoBox4 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;

        dOb = dOb + iOb;
        System.out.println("dOb: " + dOb);


        Integer iOb2 = 2;
        switch (iOb2) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Սխալ");
        }
    }
}
