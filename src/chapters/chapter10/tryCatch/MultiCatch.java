package chapters.chapter10.tryCatch;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int vals[] = {1, 2, 3};
        try {
            int result = a / b;
            vals[10] = 19;

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Ամեն դեպքում սա կերեւա");
    }
}
