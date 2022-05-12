package chapters.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("int տիպը վերափոխվում է byte-ի");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("double տիպը վերափոխվում է int-ի");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("doubl տիպը վերափոխվում է byte-ի");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}
