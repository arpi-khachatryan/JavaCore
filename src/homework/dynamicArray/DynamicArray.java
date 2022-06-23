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
        return index < size && index > -1 ? array[index] : 0;
    }

    public int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void setArray(int index, int value) {
        array[index] = value;
    }

    public void add(int index, int value) {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
            if (i == index) {
                newArray[i] = value;
                ++i;
                ++size;
                for (int j = i; j < array.length; j++) {
                    newArray[j] = array[j - 1];
                }
                break;
            }
        }
        array = newArray;
    }

    public void delete(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                for (int j = 0; j < 1; j++) {
                    array[i] = array[i];
                }
            } else if (i == index) {
                --size;
                for (int j = i; j < size; j++) {
                    array[j] = array[j + 1];
                }
                break;
            }
        }
    }

    //or
    public void annul(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[index] = array[++index];
            }
            size--;
        } else {
            System.out.println("index out of bounds");
        }
    }
}



















