package classwork.threads.javaConcurrencyEssentials;

public class ThreadLocalExample {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        Runnable task = () -> {
            //Set the value of the thread-local variable
            threadLocal.set((int) (Math.random() * 100));

            //Get the value of the thread-local variable and print it
            int value = threadLocal.get();
            System.out.println("Thread: " + Thread.currentThread().getId() + ", Value: " + value);
        };

        // Create and start multiple threads
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
