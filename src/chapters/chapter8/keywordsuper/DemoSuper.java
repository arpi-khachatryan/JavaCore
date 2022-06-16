package chapters.chapter8.keywordsuper;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 43.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(myBox1);

        double vol;

        vol = myBox1.volume();
        System.out.println("mybox1-ի ծավալը հավասար է " + vol);
        System.out.println("mybox1-ի քաշը հավասար է " + myBox1.weight);

        vol = mybox2.volume();
        System.out.println("mybox2-ի ծավալը հավասար է " + vol);
        System.out.println("mybox2-ի քաշը հավասար է " + mybox2.weight);

        vol = mybox3.volume();
        System.out.println("mybox3-ի ծավալը հավասար է " + vol);
        System.out.println("mybox3-ի քաշը հավասար է " + mybox3.weight);

        vol = mycube.volume();
        System.out.println("mycube-ի ծավալը հավասար է " + vol);
        System.out.println("mycube-ի քաշը հավասար է " + mycube.weight);

        vol = myclone.volume();
        System.out.println("myclone-ի ծավալը հավասար է " + vol);
        System.out.println("myclone-ի քաշը հավասար է " + myclone.weight);
    }
}
