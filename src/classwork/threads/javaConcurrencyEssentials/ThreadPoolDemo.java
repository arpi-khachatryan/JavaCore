package classwork.threads.javaConcurrencyEssentials;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class VegetableChopper extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " chopped a vegetable!");
    }
}

public class ThreadPoolDemo {
    public static void main(String[] args) {

        int numProc = Runtime.getRuntime().availableProcessors();
        ExecutorService pool = Executors.newFixedThreadPool(numProc);
        for (int i = 0; i < 50; i++) {
            pool.submit(new VegetableChopper());
        }
        pool.shutdown();
    }
}