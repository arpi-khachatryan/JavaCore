package classwork.threads.javaConcurrencyEssentials;


import java.util.concurrent.*;

class HowManyVegetables implements Callable {

    @Override
    public Integer call() throws Exception {
        System.out.println("Olivia is counting vegetables");
        Thread.sleep(2000);
        return 80;
    }
}

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Barron asks Olivia how many vegetables are in the pantry.");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future result = executor.submit(new HowManyVegetables());
        System.out.println("Barron can do other things while he waits for the result.");
        System.out.println("Olivia responded with " + result.get());
        executor.shutdown();
    }
}
