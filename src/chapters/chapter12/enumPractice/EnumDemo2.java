package chapters.chapter12.enumPractice;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Apple տիպի հաստատուններ");
        System.out.println();

        Apple[] allApples = Apple.values();
        for (Apple apple : allApples) {
            System.out.println(apple);
        }
        System.out.println();
//or
        for (Apple apple : Apple.values()) {
            System.out.print(apple + " ");
        }
        System.out.println();
        System.out.println();

        String apple = "Winesap";
        ap = Apple.valueOf(apple.toUpperCase());
        System.out.println(ap);

        System.out.println();

        String oneApple = Apple.CORTLAND.name();
        System.out.println(oneApple);
    }
}
