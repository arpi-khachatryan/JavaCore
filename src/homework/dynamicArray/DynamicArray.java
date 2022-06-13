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

    private void increaseArray() {
        int[] tempArray = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpaty() {
        return size == 0;
    }

    public int getByIndex(int index) {
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                return array[i];
            }
        }
        return 0;
    }

    public int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return 0;
    }

    public void setArray(int index, int value) {
        array[index] = value;
        System.out.println(array[index]);
    }

    public void add(int index, int value) {
        int[] arr = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
            if (i == index) {
                arr[i] = value;
                ++i;
                ++size;
                for (int j = i; j < array.length; j++) {
                    arr[j] = array[j - 1];
                }
                break;
            }
        }
        array = arr;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void delete(int index) {
        for (int i = 0; i < size; i++) {
            if (array[i] == array[index]) {
                ++i;
            }
            System.out.print(array[i] + " ");
        }
    }
}














