package classwork.threads.javaConcurrencyEssentials;

class DaemonThread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Olivia cleaned the kitchen.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread olivia = new DaemonThread();
        //use setDaemon() status method to change status before starting thread
        olivia.setDaemon(true);
        olivia.start();

        System.out.println("Barron is cooking...");
        Thread.sleep(600);
        System.out.println("Barron is cooking...");
        Thread.sleep(600);
        System.out.println("Barron is cooking...");
        Thread.sleep(600);
        System.out.println("Barron is done...");
    }
}
