package chapters.chapter4;

public class BoolLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        System.out.println("aa.txt = " + a);
        System.out.println("b = " + b);
        System.out.println("aa.txt | b = " + c);
        System.out.println("aa.txt & b = " + d);
        System.out.println("aa.txt ^ b = " + e);
        System.out.println("(!aa.txt&b) | (aa.txt&!b) = " + f);
        System.out.println("!aa.txt = " + g);
    }
}
