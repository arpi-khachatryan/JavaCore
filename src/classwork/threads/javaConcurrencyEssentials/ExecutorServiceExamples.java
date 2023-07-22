package classwork.threads.javaConcurrencyEssentials;

import java.util.concurrent.*;

public class ExecutorServiceExamples {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //1
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            service.execute(new Runnable() {
                public void run() {
                    System.out.println("Task executed in thread: " + Thread.currentThread().getName());
                }
            });
        }
        service.shutdown();

//        Future future = service.submit(new Runnable() {
//            public void run() {
//                System.out.println("Another thread was executed");
//            }
//        });
//        future.get();

        //2
        ExecutorService service2 = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            Future<String> future = service2.submit(new Callable<String>() {
                public String call() {
                    return "Result from thread: " + Thread.currentThread().getName();
                }
            });

            try {
                String result = future.get();
                System.out.println(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        service2.shutdown();

        //3
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            // Simulating a long-running computation
            Thread.sleep(2000);
            return 42;
        });

        try {
            // Wait for the task to complete and retrieve the result
            int result = future.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();

        //4
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future2 = executorService.submit(() -> "result");
        try {
            String result = future2.get(1L, TimeUnit.SECONDS);
            System.out.println("Result is '" + result + "'.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
        assert future.isDone();
    }
}