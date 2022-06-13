package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        for (int i = 1; i < 7; i++) {
            da.add(i);
        }
        da.print();

        System.out.println(da.isEmpaty());

        System.out.println(da.getByIndex(2));

        System.out.println(da.getFirstIndexByValue(4));

        da.setArray(1, 5);

        da.add(5, 10);

        da.delete(2);
    }
}
