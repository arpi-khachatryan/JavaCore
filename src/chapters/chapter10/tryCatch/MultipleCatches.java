package chapters.chapter10.tryCatch;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("aa.txt = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[5] = 99;
        } catch (ArithmeticException e) {
            System.out.println("0-ի բաժանում");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("try/catch օպերատորների բլոկից հետո");
    }
}
