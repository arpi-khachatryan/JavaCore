package chapters.chapter7.staticKeyword;

public class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("aa.txt = " + a);
        System.out.println("b = " + b);
    }

    static {
        b = a * 4;
    }
}
