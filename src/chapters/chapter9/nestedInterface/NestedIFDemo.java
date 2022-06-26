package chapters.chapter9.nestedInterface;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("Սա կերեւա, քանի որ արդյունքը true է");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("Սա չի երեւա, քանի որ արդյունքը false է");
        }
    }
}
