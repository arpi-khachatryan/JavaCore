package chapters.chapter8.hierarchy;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 17);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 5);
        double vol;

        vol = shipment1.volume();
        System.out.println("shipment1-ի ծավալը հավասար է " + vol);
        System.out.println("shipment1-ի քաշը հավասար է " + shipment1.weight);
        System.out.println("Առաքումն արժե՝ " + shipment1.cost + " $");
        System.out.println();
        vol = shipment2.volume();
        System.out.println("shipment2-ի ծավալը հավասար է " + vol);
        System.out.println("shipment2-ի քաշը հավասար է " + shipment2.weight);
        System.out.println("Առաքումն արժե՝ " + shipment2.cost + " $");
    }
}
