package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {9, 6, 100, 0, 90, 84, 20, 1, 10, 40};

        // first
        System.out.print("Մասիվի բոլոր էլեմենտները՝" + " ");
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
        System.out.println("Ամենամեծ թիվը՝ " + array[k]);

        // third
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[z]) {
                    z++;
                }
            }
        }
        System.out.println("Ամենափոքր թիվը՝ " + array[z]);

        // or
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Ամենափոքր թիվը՝ " + min);

        // fourth
        System.out.print("Զույգ էլեմենտները՝" + " ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        // fifth
        System.out.print("Կենտ էլեմենտները՝" + " ");
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
        System.out.println("Զույգ թվերի քանակը՝ " + even);

        // seventh
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd += 1;
            }
        }
        System.out.println("Կենտ թվերի քանակը՝ " + odd);

        // eighth
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        System.out.println("Բոլոր թվերի միջին թվաբանականը՝ " + average / array.length);

        // ninth
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Էլեմենտների գումարը՝ " + sum);
    }
}


























