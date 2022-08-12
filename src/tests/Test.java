package tests;

public class Test {

    //Արագացրեք մեթոդի աշխատանքը մի քանի անգամ, ընդամենը մի փոփոխություն անելով
    //Արդյունքը միանշանակ պետք է լինի նույնը

    private static long sum() {
        long sum = 0L;
        for (long i = 0; i < 100000000; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum());
    }
}
