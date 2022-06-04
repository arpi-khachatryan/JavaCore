package chapters.chapter7;

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        System.out.println(vol = mybox1.volume());
        System.out.println(vol = mybox2.volume());
        System.out.println(mycube.volume());
    }
}
