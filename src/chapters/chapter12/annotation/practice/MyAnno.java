package chapters.chapter12.annotation.practice;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str() default "Թեստավորում";

    int i() default 200;
}
