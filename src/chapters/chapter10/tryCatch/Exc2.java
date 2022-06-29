package chapters.chapter10.tryCatch;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Սա չի երեւա, քանի որ exception-ի դեպքում կաշխատի catch-ը");
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("0-ի բաժանում");
        }
        System.out.println("catch օպերատորից հետո");
    }
}
