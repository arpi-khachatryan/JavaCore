package chapters.chapter9.packagePractice.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("Derived");
        System.out.println("n = " + n);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub =" + n_pub);
    }
}
