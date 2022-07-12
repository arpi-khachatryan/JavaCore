package chapters.chapter12.annotation.practice;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value();

    int i() default 50;
}