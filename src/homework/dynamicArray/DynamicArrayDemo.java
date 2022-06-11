package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        for (int i = 1; i < 8; i++) {
            da.add(i);
        }
        System.out.println(da.isEmpaty());

        System.out.println(da.getByIndex(2));

        System.out.println(da.getFirstIndexByValue(4));

        da.setArray(1, 5);

        da.add(2, 9);

        da.delete(1);
    }
}
