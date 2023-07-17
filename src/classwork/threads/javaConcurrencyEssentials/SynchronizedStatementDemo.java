package classwork.threads.javaConcurrencyEssentials;

class SynchronizedStatement extends Thread {

    //static int garlicCount = 0;
    static Integer garlicCount = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            synchronized (this){
//                garlicCount++;
//            }
            synchronized (garlicCount) {
                garlicCount++;
            }
        }
    }
}

public class SynchronizedStatementDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread barron = new SynchronizedStatement();
        Thread olivia = new SynchronizedStatement();

        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("We should buy " + SynchronizedStatement.garlicCount + " garlic.");
    }
}
