package classwork.threads.javaConcurrencyEssentials;

class SynchronizedMethod extends Thread {

    static int garlicCount = 0;

    private static synchronized void addGarlic() {
        garlicCount++;
    }

    @Override
    public void run() {
//        for (int i = 0; i < 10; i++) {
            for (int i = 0; i < 10_000_000; i++) {
                addGarlic();
            }
        }
    }

    public class SynchronizedMethodDemo {
        public static void main(String[] args) throws InterruptedException {
            Thread barron = new SynchronizedMethod();
            Thread olivia = new SynchronizedMethod();

            barron.start();
            olivia.start();
            barron.join();
            olivia.join();
            System.out.println("We should buy " + DataRace.garlicCount + " garlic.");
        }
    }