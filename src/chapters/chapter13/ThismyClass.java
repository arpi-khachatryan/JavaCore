package chapters.chapter13;

public class ThismyClass {
    int a, b;

    ThismyClass(int i, int j) {
        a = i;
        b = j;
    }

    ThismyClass(int i) {
        this(i, i);
    }

    ThismyClass() {
        this(0);
    }
}
