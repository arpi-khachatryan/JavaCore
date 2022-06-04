package chapters.chapter7;

public class OverloadConsDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
        System.out.println(mycube.volume());
    }
}
