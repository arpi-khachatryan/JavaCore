package classwork.threads.javaConcurrencyEssentials.atomic;

import java.util.concurrent.atomic.AtomicInteger;

//If there are only simple operations, like increment the variables value, then a simple way to do that in Java is by using Atomic package.
class AtomicVariable extends Thread {

    static AtomicInteger garlicCount = new AtomicInteger(0);

    @Override
    public void run() {
//        for (int i = 0; i < 10; i++) {
        for (int i = 0; i < 10_000_000; i++) {
            garlicCount.incrementAndGet();
        }
    }
}

public class AtomicVariableDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new AtomicVariable();
        Thread olivia = new AtomicVariable();

        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("We should buy " + AtomicVariable.garlicCount + " garlic.");
    }
}