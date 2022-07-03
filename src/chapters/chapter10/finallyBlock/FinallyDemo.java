package chapters.chapter10.finallyBlock;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("procA() մեթոդի մարմնում");
            throw new RuntimeException();
        } finally {
            System.out.println("procA() մեթոդում finally օպերատորի բլոկը");
        }
    }

    static void procB() {
        try {
            System.out.println("procB() մեթոդի մարմնում");
            return;
        } finally {
            System.out.println("procB() մեթոդում finally օպերատորի բլոկը");
        }
    }

    static void procC() {
        try {
            System.out.println("procC() մեթոդի մարմնում");
        } finally {
            System.out.println("procC() մեթոդում finally օպերատորի բլոկը");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Բացառությունը catch է եղել");
        }
        procB();
        procC();
    }
}
