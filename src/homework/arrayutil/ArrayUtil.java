package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {9, 5, 7, 1, 90, 80, 20, 8, 10, 2};

        // first
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // second
        int k = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[k] < array[i]) {
                k++;
            }
        }
        for (int j = 0; j < 1; j++) {
            System.out.println(array[k]);
        }

        // third
        int z = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[z] > array[i]) {
                z++;
                i--;
            }
        }
        for (int j = 0; j < 1; j++) {
            System.out.println(array[z]);
        }

        // fourth
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        // fifth
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        // sixth
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result += 1;
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.print(result);
        }
        System.out.println();

        // seventh
        int result_ = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result_ += 1;
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.print(result_);
        }
        System.out.println();

        // eighth
        int result__ = 0;
        for (int i = 0; i < array.length; i++) {
            result__ += array[i];
        }
        System.out.println(result__ / array.length);

        // ninth
        int result___ = 0;
        for (int i = 0; i < array.length; i++) {
            result___ += array[i];
        }
        System.out.print(result___);
    }
}
























