package chapters.chapter12.annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepeatedAnnos.class)
public @interface MyAnnoRepeat {
    String str() default "h";

    int val() default 100;
}
