package homework.arrayutil;

public class ArrayUtil2Demo {
    public static void main(String[] args) {
        ArrayUtil2 au = new ArrayUtil2();
        int[] numbers = {9, 6, 100, 0, 90, 84, 20, 1, 10, 40};


        System.out.print("Մասիվի բոլոր էլեմենտները՝" + " ");
        au.allArray(numbers);
        System.out.println();

        System.out.println("Ամենամեծ թիվը՝ " + au.max(numbers));
        System.out.println("Ամենափոքր թիվը՝ " + au.min(numbers));

        System.out.print("Զույգ էլեմենտները՝" + " ");
        au.allEven(numbers);
        System.out.println();

        System.out.print("Կենտ էլեմենտները՝" + " ");
        au.allOdd(numbers);
        System.out.println();

        System.out.println("Զույգ թվերի քանակը՝ " + au.even(numbers));
        System.out.println("Կենտ թվերի քանակը՝ " + au.odd(numbers));
        System.out.println("Բոլոր թվերի միջին թվաբանականը՝ " + au.average(numbers));
        System.out.println("Էլեմենտների գումարը՝ " + au.sum(numbers));
    }
}
