package chapters.chapter8;

public class RefDemo {
    public static void main(String[] args) {

        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();    //or Box plainbox=weightbox;
        double vol;

        vol = weightbox.volume();
        System.out.println("weightbox-ի ծավալը հավասար է " + vol);
        System.out.println("weightbox-ի քաշը հավասար է " + weightbox.weight);

        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("plainbox-ի ծավալը հավասար է " + vol);
    }
}