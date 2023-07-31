package classwork.threads.javaConcurrencyEssentials;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TryLock extends Thread {

    private int itemsToAdd = 0;//Items this shopper is waiting to add
    private static int itemsOnNoted = 0;// Total items on shared notepad
    private static Lock pencil = new ReentrantLock();

    public TryLock(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        while (itemsOnNoted <= 20) {
            if ((itemsToAdd > 0) && pencil.tryLock()) {
                try {
//                    pencil.lock();
//                    pencil.tryLock();
                    itemsOnNoted += itemsToAdd;
                    System.out.println(this.getName() + " added " + itemsToAdd + " item(s) tp notepad");
                    itemsToAdd = 0;
                    Thread.sleep(300);//time spent writing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    pencil.unlock();
                }
            } else { //look for other things to buy
                try {
                    Thread.sleep(100);
                    itemsToAdd++;
                    System.out.println(this.getName() + " found something to buy.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class TryLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new TryLock("Barron");
        Thread olivia = new TryLock("Olivia");

        long start = System.currentTimeMillis();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        long finish = System.currentTimeMillis();
        System.out.println("Elapsed Time: " + (float) (finish - start) / 1000 + " seconds");
    }
}