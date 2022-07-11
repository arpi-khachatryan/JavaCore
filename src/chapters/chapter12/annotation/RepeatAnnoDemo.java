package chapters.chapter12.annotation;

import java.lang.reflect.Method;

public class RepeatAnnoDemo {
    @MyAnnoRepeat(str = "1", val = -1)
    @MyAnnoRepeat(str = "2", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnnoDemo ob = new RepeatAnnoDemo();
        try {
            Class<? extends RepeatAnnoDemo> aClass = ob.getClass();
            Method method = aClass.getMethod("myMeth", String.class, int.class);
            RepeatedAnnos annotation = method.getAnnotation(RepeatedAnnos.class);
            System.out.println(annotation);
//or
            MyAnnoRepeat[] annotationsByType = method.getAnnotationsByType(MyAnnoRepeat.class);
            for (MyAnnoRepeat myAnnoRepeat : annotationsByType) {
                System.out.println(myAnnoRepeat);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Մեթոդը չի գտնվել");
        }
    }

    public static void main(String[] args) {
        myMeth("Թեստ", 10);
    }
}
