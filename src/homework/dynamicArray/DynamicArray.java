package homework.dynamicArray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length - 1) {
            increaseArray();
        }
        array[size++] = value;
    }

    public void increaseArray() {
        int[] tempArray = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public boolean isEmpaty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int getByIndex(int index) {
        for (int i = 0; i < array.length; i++) {
            if (index == i)
                return array[i];
        }
        return 0;
    }

    public int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return 0;
    }

    public void setArray(int index, int value) {
        array[index] = value;
        System.out.println(array[index]);
    }

    public void add(int index, int value) {
        int[] arr = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
            if (i == index) {
                arr[i] = value;
                ++i;
                for (int j = i; j < arr.length; j++) {
                    arr[j] = array[j - 1];
                }
                break;
            }
        }
        array = arr;
        for (int x : array) {
            System.out.println(x);
        }
    }

    public void delete(int index) {
        for (int i = 0; i < size; i++) {
            array[index] = 0;
            System.out.print(array[i] + " ");
        }
    }
}














