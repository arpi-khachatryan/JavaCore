package diferent.unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class EverythingIsTrue {
    static void setFinalStatic(Field field, Object newValue) throws Exception {
        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        field.set(field, newValue);
    }

    public static void main(String[] args) throws Exception {
        setFinalStatic(Boolean.class.getField("FALSE"), true);
        System.out.format("Everything is %s", false); // "Everything is true"
    }
}
