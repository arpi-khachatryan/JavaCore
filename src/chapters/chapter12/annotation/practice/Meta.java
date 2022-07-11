package chapters.chapter12.annotation.practice;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno()
    public static void meth() {
        Meta ob = new Meta();
        try {
            Class<? extends Meta> aClass = ob.getClass();
            Method method = aClass.getMethod("meth");
            MyAnno myAnno = method.getAnnotation(MyAnno.class);
            System.out.println(myAnno.str() + " " + myAnno.i());
        } catch (NoSuchMethodException e) {
            System.out.println("Մեթոդը չի գտնվել");
        }
    }

    public static void main(String[] args) {
        meth();
    }
}