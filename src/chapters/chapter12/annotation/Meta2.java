package chapters.chapter12.annotation;

import java.lang.reflect.Method;

public class Meta2 {
    @MyAnno(str = "Երկու պարամետր", val = 19)
    public static void myMeth(String str, int i) {
        try {
            Method myMethod = Meta2.class.getMethod("myMeth", String.class, int.class);
            MyAnno myAnno = myMethod.getAnnotation(MyAnno.class);
            System.out.println(myAnno.str() + " " + myAnno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Մեթոդը չի գտնվել");
        }
    }

    public static void main(String[] args) {
        myMeth("Օրինակ", 100);
    }
}