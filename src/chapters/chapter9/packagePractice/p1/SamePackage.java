package chapters.chapter9.packagePractice.p1;

public class SamePackage {
    SamePackage() {
        System.out.println("SamePackage");
        Protection p = new Protection();
        System.out.println("n = " + p.n);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
