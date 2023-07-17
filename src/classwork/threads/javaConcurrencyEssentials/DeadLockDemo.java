package classwork.threads.javaConcurrencyEssentials;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadLock extends Thread {

    private Lock firstChopstick, secondChopstick;
    private static int sushiCount = 10;

    public DeadLock(String name, Lock firstChopstick, Lock secondChopstick) {
        this.setName(name);
        this.firstChopstick = firstChopstick;
        this.secondChopstick = secondChopstick;
    }

    @Override
    public void run() {
        while (sushiCount > 0) { //set sushi until it is all gone

            //pick up chopsticks
            firstChopstick.lock();
            secondChopstick.lock();

            //take a piece of sushi
            if (sushiCount > 0) {
                sushiCount--;
                System.out.println(this.getName() + " took a piece! Sushi remaining: " + sushiCount);
            }

            //put down chopsticks
            secondChopstick.unlock();
            firstChopstick.unlock();
        }
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
        Lock chopstickA = new ReentrantLock();
        Lock chopstickB = new ReentrantLock();
        Lock chopstickC = new ReentrantLock();

        new DeadLock("Barron", chopstickA, chopstickB).start();
        new DeadLock("Olivia", chopstickB, chopstickC).start();
        new DeadLock("Steve", chopstickA, chopstickC).start();

//        new DeadLock("Barron", chopstickA, chopstickB).start();
//        new DeadLock("Olivia", chopstickB, chopstickC).start();
//        new DeadLock("Steve", chopstickC, chopstickA).start();
    }
}
