package chapters.chapter7.accessModifiers;

import chapters.chapter7.accessModifiers.AccessTest;

public class AccessTestDemo {
    public static void main(String[] args) {
        AccessTest at = new AccessTest();
        at.a = 10;
        at.b = 20;

        at.setc(30);

        System.out.println("aa.txt, b, c: " + at.a + " " + at.b + " " + at.getc());
    }
}
