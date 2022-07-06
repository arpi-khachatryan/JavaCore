package chapters.chapter12.enumPractice;

import chapters.chapter12.enumPractice.Apple;

public class EnumDemo {
    public static void main(String[] args) {
        // Apple ap = Apple.RED_DEL;
        Apple ap;
        ap = Apple.RED_DEL;
        System.out.println(ap);

        if (ap == Apple.GOLDEN_DEL) {
            System.out.println("RED_DEL = GOLDEN_DEL");
        }

        ap = Apple.GOLDEN_DEL;

        switch (ap) {
            case JONATHAN:
                System.out.println("red apple");
                break;
            case GOLDEN_DEL:
                System.out.println("yellow apple");
                break;
            case RED_DEL:
                System.out.println("red apple");
                break;
            case WINESAP:
                System.out.println("red apple");
                break;
            case CORTLAND:
                System.out.println("red apple");
                break;
            default:
                System.out.println("yellow or red apple");
        }
    }
}
