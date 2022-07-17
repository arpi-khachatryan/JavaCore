package chapters.chapter10.tryCatch;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = 2;
            int b = 42 / a;
            System.out.println("aa.txt = " + a);
            try {
                if (a == 1) {
                    a = a / (a - a);
                }
                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("e");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
