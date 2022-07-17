package chapters.chapter10.tryCatch;

public class MethNestTry {
    static void nestTry(int a) {
        try { //սա համարվում է ներդրված try
            if (a == 1) {
                a = a / (a - a);
            }
            if (a == 2) {
                int c[] = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 42 / a;
            System.out.println("aa.txt = " + a);
            nestTry(a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
