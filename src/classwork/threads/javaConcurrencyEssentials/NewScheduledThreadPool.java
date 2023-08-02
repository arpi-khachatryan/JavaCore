package classwork.threads.javaConcurrencyEssentials;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewScheduledThreadPool {
    public static void main(String[] args) {

        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Schedule a task to be executed after a delay of 2 seconds
        scheduledThreadPool.schedule(new Runnable() {
            public void run() {
                System.out.println("Task 1 executed after 2 seconds.");
            }
        }, 2, TimeUnit.SECONDS);

        // Schedule a task to be executed at a fixed rate of every 3 seconds
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("Task 2 executed every 3 seconds.");
            }
        }, 0, 3, TimeUnit.SECONDS);

        // Schedule a task to be executed with a fixed delay of 5 seconds between the end of the previous execution and the start of the next execution
        scheduledThreadPool.scheduleWithFixedDelay(new Runnable() {
            public void run() {
                System.out.println("Task 3 executed with a fixed delay of 5 seconds.");
            }
        }, 0, 5, TimeUnit.SECONDS);

        // Sleep for 15 seconds to allow tasks to be executed
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Shutdown the ScheduledExecutorService properly to release resources
        scheduledThreadPool.shutdown();
    }
}