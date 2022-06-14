package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        for (int i = 0; i < 7; i++) {
            da.add(i);
        }
        System.out.println(da.isEmpaty());

        System.out.println(da.getByIndex(2));

        System.out.println(da.getFirstIndexByValue(2));

        da.setArray(1, 18);

        da.add(5, 10);

        da.delete(8);

        da.print();
    }
}