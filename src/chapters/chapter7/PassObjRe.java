package chapters.chapter7;

public class PassObjRe {
    int a, b;

    PassObjRe(int i, int j) {
        a = i;
        b = j;
    }

    void meth(PassObjRe ob) {
        ob.a *= 2;
        ob.b /= 2;
    }
}
