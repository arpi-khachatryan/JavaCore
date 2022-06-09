package homework.arrayutil;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        for (int i = 0; i < 25; i++) {
            da.add(i);
        }
        da.print();
    }
}
