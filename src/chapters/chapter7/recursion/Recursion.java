package chapters.chapter7.recursion;


public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        for (int i = 5; i > 0; i--) {
            System.out.println(f.fact(i));
        }
    }
}
