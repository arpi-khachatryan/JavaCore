package classwork.threads.javaConcurrencyEssentials;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BarrierClass extends Thread {
    public static int bagsOfChips = 1; //start with one on the left
    private static Lock pencil = new ReentrantLock();
    private static CyclicBarrier firstBump = new CyclicBarrier(10);

    public BarrierClass(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        if (this.getName().contains("Olivia")) {
            pencil.lock();
            try {
                bagsOfChips += 3;
                System.out.println(this.getName() + " ADDED three bags of chips.");
            } finally {
                pencil.unlock();
            }
            try {
                firstBump.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        } else {
            // "Barron"
            try {
                firstBump.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            pencil.lock();
            try {
                bagsOfChips *= 2;
                System.out.println(this.getName() + " DOUBLED the bags of chips.");
            } finally {
                pencil.unlock();
            }
        }
    }
}

public class BarrierDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new BarrierClass("Reader-" + i).start();
        }
        try {
            Thread.sleep(1000); // Wait for all threads to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total bags of chips: " + BarrierClass.bagsOfChips);

//        BarrierClass olivia = new BarrierClass("Olivia");
//        BarrierClass barron = new BarrierClass("Barron");
//
//        olivia.start();
//        barron.start();
//
//        try {
//            olivia.join();
//            barron.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Total bags of chips: " + BarrierClass.bagsOfChips);
    }
}