package classwork.threads.javaConcurrencyEssentials;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AbandonedLock extends Thread {

    private Lock firstChopstick, secondChopstick;
    private static int sushiCount = 500;

    public AbandonedLock(String name, Lock firstChopstick, Lock secondChopstick) {
        this.setName(name);
        this.firstChopstick = firstChopstick;
        this.secondChopstick = secondChopstick;
    }

    @Override
    public void run() {
        //set sushi until it is all gone
        while (sushiCount > 0) {

            //pick up chopsticks
            firstChopstick.lock();
            secondChopstick.lock();

            try {
                //take a piece of sushi
                if (sushiCount > 0) {
                    sushiCount--;
                    System.out.println(this.getName() + " took a piece! Sushi remaining: " + sushiCount);
                }

                if (sushiCount == 10) {
                    System.out.println(1 / 0);
                }
            } finally {
                //put down chopsticks
                secondChopstick.unlock();
                firstChopstick.unlock();
            }


//            if (sushiCount == 10) {
//                System.out.println(10 / 0);
//            }
//            //take a piece of sushi
//            if (sushiCount > 0) {
//                sushiCount--;
//                System.out.println(this.getName() + " took a piece! Sushi remaining: " + sushiCount);
//            }
//            //put down chopsticks
//            secondChopstick.unlock();
//            firstChopstick.unlock();
        }
    }
}

public class AbandonedLockDemo {

    public static void main(String[] args) {
        Lock chopstickA = new ReentrantLock();
        Lock chopstickB = new ReentrantLock();
        Lock chopstickC = new ReentrantLock();

        new AbandonedLock("Barron", chopstickA, chopstickB).start();
        new AbandonedLock("Olivia", chopstickB, chopstickC).start();
        new AbandonedLock("Steve", chopstickA, chopstickC).start();
    }
}
