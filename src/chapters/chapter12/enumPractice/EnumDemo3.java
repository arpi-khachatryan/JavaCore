package chapters.chapter12.enumPractice;

public class EnumDemo3 {
    public static void main(String[] args) {
        int jonathanPrice = Apple.JONATHAN.getPrice();
        System.out.println("jonathan տեսակի խնձորը արժե " + jonathanPrice + " դրամ");

        System.out.println("goldenDel տեսակի խնձորը արժե " + Apple.GOLDEN_DEL.getPrice() + " դրամ");

        Apple.GOLDEN_DEL.setPrice(500);
        System.out.println("goldenDel տեսակի խնձորը արժե " + Apple.GOLDEN_DEL.getPrice() + " դրամ");

        System.out.println("Յուրաքանչյուրի արժեքը՝ ");

        Apple ap;
        for (Apple a : Apple.values()) {
            System.out.println(a + " արժե " + a.getPrice());
        }
        System.out.println();

        Apple[] allApples = Apple.values();
        for (Apple a : allApples) {
            System.out.println(a + " արժե " + a.getPrice());
        }
    }
}
