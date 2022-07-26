package chapters.chapter14.part3;

public class MyClass<T, V> {
    T ob1;
    V ob2;

    MyClass(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    boolean isSame(MyClass<T, V> o) {
        if (ob1 == o.ob1 && ob2 == o.ob2) {
            return true;
        } else {
            return false;
        }
    }
}

class Demo {
    public static void main(String[] args) {
        MyClass<Integer, String> mcOb = new MyClass<>(1, "test");
        if (mcOb.isSame(new MyClass<>(1, "test"))) {
            System.out.println("Same");
        } else {
            System.out.println(false);
        }
    }
}
