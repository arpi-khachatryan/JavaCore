package chapters.chapter7;

public class CallByValueDemo {
    public static void main(String[] args) {
        CallByValue test = new CallByValue();
        int a = 15;
        int b = 20;
        System.out.println("aa.txt & b: " + a + " " + b);

        test.meth(a, b);
        System.out.println("aa.txt & b: " + a + " " + b);
    }
}
