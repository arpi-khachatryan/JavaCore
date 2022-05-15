package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {9, 5, 0, 4, 90, 80, 20, 1, 100, 89};

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
                i--;
            }
        }
        System.out.println(array[k]);

        // third
        int z = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[z]) {
                z++;
                i--;
            }
        }
        System.out.println(array[z]);

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
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even += 1;
            }
        }
        System.out.println(even);

        // seventh
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd += 1;
            }
        }
        System.out.println(odd);

        // eighth
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        System.out.println(average / array.length);

        // ninth
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
























