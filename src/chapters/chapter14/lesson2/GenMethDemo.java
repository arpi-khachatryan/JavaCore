package chapters.chapter14.lesson2;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++)
            if (x.equals(y[i]))
                return true;
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        if (isIn(1, nums)) {
            System.out.println(true);
        }
        if (!isIn(7, nums)) {
            System.out.println(false);
        }

        String str[] = {"one", "two", "three", "four", "five"};
        if (isIn("one", str)) {
            System.out.println(true);
        }
        if (!isIn("six", str)) {
            System.out.println(false);
        }
    }
}
