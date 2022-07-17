package chapters.chapter7;


public class PassObjReDemo {
    public static void main(String[] args) {
        PassObjRe test = new PassObjRe(15, 20);
        System.out.println("test.aa.txt & test.b: " + test.a + " " + test.b);

        test.meth(test);
        System.out.println("test.aa.txt & test.b: " + test.a + " " + test.b);
    }
}
