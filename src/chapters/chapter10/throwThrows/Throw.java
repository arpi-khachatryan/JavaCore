package chapters.chapter10.throwThrows;

public class Throw {
    static void proc() {
        try {
            throw new NullPointerException("Բացառություն");
        } catch (NullPointerException e) {
            System.out.println("Բացառություն proc() մեթոդի մարմնում");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            proc();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
