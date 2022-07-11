package chapters.chapter12.annotation.practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
public @interface EmptyOk {
}
