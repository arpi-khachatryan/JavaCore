package homework.arrayutil;

public class DynamicArray {
    int[] array = new int[10];
    int size = 0;

    void add(int value) {
        if (size == array.length-1) {
            increaseArray();
        }
        array[size++] = value;
    }

    void increaseArray() {
        int[] tempArray = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
