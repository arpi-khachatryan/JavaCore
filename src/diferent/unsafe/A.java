package diferent.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

import static sun.misc.Unsafe.ARRAY_OBJECT_BASE_OFFSET;

public class A {

    public int a;
}

class B {

    public int b;
}

class C {

    public static Unsafe getUnsafe() {
        try {
            // получаем поле
            Field field = Unsafe.class.getDeclaredField("theUnsafe");

            // делаем его доступным для использования
            field.setAccessible(true);

            // получаем экземпляр sun.misc.Unsafe
            return (Unsafe) field.get(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//        java.lang.reflect.Field;
        A obj = new A();
        obj.a = 100;
        B[] array = new B[1];
        getUnsafe().putObject(array, ARRAY_OBJECT_BASE_OFFSET, obj);
        System.out.println(array[0].b);
    }
}
