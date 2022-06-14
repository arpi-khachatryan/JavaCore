package chapters.chapter7.varargs;

public class PassArrayDemo {
    public static void main(String[] args) {
        int n1[] = {10};
        int n2[] = {1, 2, 3};
        int n3[] = {};
        PassArray.vaTest(n1);
        PassArray.vaTest(n2);
        PassArray.vaTest(n3);
    }
}
