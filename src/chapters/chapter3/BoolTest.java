package chapters.chapter3;

import sun.security.rsa.RSAUtil;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b = " + b);
        b = true;
        System.out.println("b = " + b);
        if (b) {
            System.out.println("Կոդը իրականացվում է");
        }
        b = false;
        if (b) {
            System.out.println("Կոդը չի իրականացվում");
        }
        System.out.println("10 > 9 = " + (10 > 9));
    }
}
