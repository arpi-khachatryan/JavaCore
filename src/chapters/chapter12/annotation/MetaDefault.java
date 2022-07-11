package chapters.chapter12.annotation;

import java.lang.reflect.Method;

public class MetaDefault {
    @MyAnnoDefault()
    public static void meth() {
        MetaDefault ob = new MetaDefault();
        try {
            Class<? extends MetaDefault> aClass = ob.getClass();
            Method method = aClass.getMethod("meth");
            MyAnnoDefault myAnno = method.getAnnotation(MyAnnoDefault.class);
            System.out.println(myAnno.str() + " " + myAnno.i());
        } catch (NoSuchMethodException e) {
            System.out.println("Մեթոդը չի գտնվել");
        }
    }

    public static void main(String[] args) {
        meth();
    }
}