package chapters.chapter4;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -1 : i;
        System.out.println("i = " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("i = " + k);
    }
}

