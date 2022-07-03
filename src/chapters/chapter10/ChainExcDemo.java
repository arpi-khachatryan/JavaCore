package chapters.chapter10;

public class ChainExcDemo {
    static void demoProc() {
        NullPointerException e = new NullPointerException();
        e.initCause(new ArithmeticException("Պատճառը"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}
