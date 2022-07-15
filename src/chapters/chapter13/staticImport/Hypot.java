package chapters.chapter13.staticImport;

public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.3;

        hypot = Math.sqrt(Math.pow(side1, 2)) + Math.pow(side2, 2);
        System.out.println(hypot);
    }
}
