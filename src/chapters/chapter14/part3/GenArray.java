package chapters.chapter14.part3;

public class GenArray<T extends Number> {
    T ob;
    T[] vals;

    GenArray(T o, T[] nums) {
        ob = o;
        vals = nums;
    }
}

class GenArrayDemo {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};
        GenArray<Integer> iOb = new GenArray<>(50, n);
        GenArray<?>[] gens = new GenArray<?>[10];
    }
}
