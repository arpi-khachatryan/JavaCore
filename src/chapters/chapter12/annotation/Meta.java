package chapters.chapter12.annotation;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "Անոտացիայի օրինակ", val = 100)
    public static void myMeth() {

        Meta ob = new Meta();

        try {
            Class<? extends Meta> aClass = ob.getClass();

            Method myMeth = aClass.getMethod("myMeth");

            MyAnno myAnno = myMeth.getAnnotation(MyAnno.class);
            System.out.println(myAnno.str() + " " + myAnno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Մեթոդը չի գտնվել");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
