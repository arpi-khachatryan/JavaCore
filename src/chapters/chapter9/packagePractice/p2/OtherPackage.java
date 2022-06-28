package chapters.chapter9.packagePractice.p2;

import chapters.chapter9.packagePractice.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        System.out.println("OtherPackage");
        Protection p = new Protection();
        System.out.println("n_pub = " + p.n_pub);
    }
}
