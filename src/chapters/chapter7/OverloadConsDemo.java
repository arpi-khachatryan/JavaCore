package chapters.chapter7;

public class OverloadConsDemo {
    public static void main(String[] args) {
        OverloadCons mybox1 = new OverloadCons(10, 20, 15);
        OverloadCons mybox2 = new OverloadCons();
        OverloadCons mycube = new OverloadCons(7);

        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
        System.out.println(mycube.volume());
    }
}
