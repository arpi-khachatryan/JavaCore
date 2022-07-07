package chapters.chapter12.enumPractice;

public class EnumDemo4 {
    public static void main(String[] args) {
        for (Apple apple : Apple.values()) {
            System.out.println(apple + ". " + apple.ordinal());
        }
        System.out.println();

        Apple ap1, ap2, ap3;
        ap1 = Apple.RED_DEL;
        ap2 = Apple.GOLDEN_DEL;
        ap3 = Apple.RED_DEL;
        if (ap1.compareTo(ap2) < 0) {
            System.out.println(Apple.RED_DEL.ordinal() + " & " + Apple.GOLDEN_DEL.ordinal());
        }
        if (ap1.compareTo(ap2) > 0) {
            System.out.println(Apple.RED_DEL.ordinal() + " && " + Apple.GOLDEN_DEL.ordinal());
        }
        if (ap1.compareTo(ap3) == 0) {
            System.out.println(ap1 + " = " + ap3);
        }


        if (ap1.equals(ap2)) {
            System.out.println("Սխալ");
        }
        if (ap1.equals(ap3)) {
            System.out.println(ap1 + " = " + ap3);
        }


        if (ap1 == ap3) {
            System.out.println(ap1 + " == " + ap3);
        }
    }
}
