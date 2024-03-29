package classwork.threads.javaConcurrencyEssentials.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class MainAtomic {

    static AtomicInteger atomicInteger = new AtomicInteger(0);  // int i;

    static class MyThread extends Thread {
        @Override
        public void run() {
            atomicInteger.incrementAndGet(); //   i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new MyThread().start();
        }
        Thread.sleep(1000);
        System.out.println(atomicInteger.get());   // System.out.println(i);
    }
}
