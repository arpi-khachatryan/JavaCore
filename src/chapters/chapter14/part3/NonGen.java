package chapters.chapter14.part3;

public class NonGen {
    int num;

    NonGen(int i) {
        num = i;
    }

    int getNum() {
        return num;
    }
}

class Gen<T> extends NonGen {
    T ob;

    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class HierDemo {
    public static void main(String[] args) {
        Gen<String> w = new Gen<>("NonGenClass", 22);
        System.out.println(w.getOb());
        System.out.println(w.getNum());
    }
}
