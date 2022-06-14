package chapters.chapter7.varargs;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.println(msg + " " + v.length + " պարունակությունը`");
        for (int i : v) {
            System.out.println(i + " ");
        }
    }
}
