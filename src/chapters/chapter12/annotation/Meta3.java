package chapters.chapter12.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "Թեստային մեթոդի անոտացիա")
@MyAnno(str = "Meta3", val = 100)
public class Meta3 {

    @What(description = "Թեստային մեթոդի անոտացիա")
    @MyAnno(str = "Թեստավորում", val = 100)
    public static void meth() {
        Meta3 meta = new Meta3();
        try {
            Annotation[] annotations = meta.getClass().getAnnotations();
            System.out.println("Meta3 կլասի բոլոր անոտացիաները");
            for (Annotation a : annotations) {
                System.out.println(a);
            }
            System.out.println();

            Method m = meta.getClass().getMethod("meth");
            Annotation[] annos = m.getAnnotations();
            System.out.println("meth մեթոդի բոլոր անոտացիաները");
            for (Annotation a : annos) {
                System.out.println(a);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Մեթոդը չի գտնվել");
        }
    }

    public static void main(String[] args) {
        meth();
    }
}
