package classwork.threads.javaConcurrencyEssentials;

class DataRace extends Thread {

    static int garlicCount = 0;

    @Override
    public void run() {
//        for (int i = 0; i < 10; i++) {
        for (int i = 0; i < 10_000_000; i++) {
            garlicCount++;
        }
    }
}

public class DataRaceDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new DaemonThread();
        Thread olivia = new DaemonThread();

        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("We should buy " + DataRace.garlicCount + " garlic.");
    }
}