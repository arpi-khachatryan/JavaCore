package chapters.chapter12.annotation.practice;

import java.lang.reflect.Method;

public class Marker {
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();
        try {
            Method method = Marker.class.getMethod("myMeth");
            if (method.isAnnotationPresent(MyMarker.class)) {
                System.out.println("Անոտացիա, առանց մարմնի");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Մեթոդը չի գտնվել");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
