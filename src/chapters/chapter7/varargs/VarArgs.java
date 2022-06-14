package chapters.chapter7.varargs;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.println("Արգումենտների քանակը " + v.length + " պարունակությունը`");
        for (int i : v) {
            System.out.println(i);
        }
    }
}
