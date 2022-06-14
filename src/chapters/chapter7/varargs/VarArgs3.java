package chapters.chapter7.varargs;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.println("vaTest(int ...): " + " արգումենտների քանակը: " + v.length + " պարունակությունը: ");
        for (int i : v) {
            System.out.println(i + " ");
        }
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean ...): " + " արգումենտների քանակը: " + v.length + " պարունակությունը: ");
        for (boolean i : v) {
            System.out.println(i + " ");
        }
    }

    static void vaTest(String msg, int... v) {
        System.out.println("String msg, int ...): " + " արգումենտների քանակը: " + v.length + " պարունակությունը: ");
        for (int i : v) {
            System.out.println(i + " ");
        }
    }
}
