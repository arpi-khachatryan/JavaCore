package chapters.chapter7.staticKeyword;

import chapters.chapter7.staticKeyword.StaticByName;

public class StaticByNameDemo {
    public static void main(String[] args) {
        StaticByName.callme();
        System.out.println("b = " + StaticByName.b);
    }
}
