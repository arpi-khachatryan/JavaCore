package chapters.chapter14.part3;

public class Bridge<T> {
    T ob;

    Bridge(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class Bridge2 extends Bridge<String> {
    Bridge2(String o) {
        super(o);
    }

    String getOb() {
        System.out.println("getOb");
        return ob;
    }
}

class BridgeDemo {
    public static void main(String[] args) {
        Bridge2 strOb2 = new Bridge2("Gen");
        System.out.println(strOb2.getOb());
    }
}
