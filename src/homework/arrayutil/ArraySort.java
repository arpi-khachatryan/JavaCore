package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int[] number = {43, 55, 5, -9, 0, 12, 5, 65};

        //first

        int increase = 0;
        for (int i = 1; i < number.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                while (number[j] > number[i]) {
                    increase = number[i];
                    number[i] = number[j];
                    number[j] = increase;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

        //second

        int decrease = 0;
        for (int i = 1; i < number.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                while (number[j] < number[i]) {
                    decrease = number[i];
                    number[i] = number[j];
                    number[j] = decrease;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
