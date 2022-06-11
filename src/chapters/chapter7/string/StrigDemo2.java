package chapters.chapter7.string;

public class StrigDemo2 {
    public static void main(String[] args) {
        String strOb1 = "First line";
        String strOb2 = "second line";
        String strOb3 = strOb1;

        System.out.println(strOb1.length());
        System.out.println(strOb1.charAt(3));

        if (strOb1.equals(strOb2)) {
            System.out.println("strOb1 == strOb2");
        } else {
            System.out.println("strOb1 != strOb2");
        }

        if (strOb1.equals(strOb3)) {
            System.out.println("strOb1 == starOb3");
        } else {
            System.out.println("strOb1 != strOb3");
        }
    }
}
