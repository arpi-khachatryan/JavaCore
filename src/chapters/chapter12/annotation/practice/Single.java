package chapters.chapter12.annotation.practice;

import java.lang.reflect.Method;

public class Single {
    @MySingle(10)
    public static void meth() {

        Single ob = new Single();

        try {
            Method method = Single.class.getMethod("meth");
            MySingle mySingle = method.getAnnotation(MySingle.class);
            System.out.println(mySingle.value() + " " + mySingle.i());
        } catch (NoSuchMethodException e) {
            System.out.println("Մեթոդը չի գտնվել");
        }
    }

    public static void main(String[] args) {
        meth();
    }
}
