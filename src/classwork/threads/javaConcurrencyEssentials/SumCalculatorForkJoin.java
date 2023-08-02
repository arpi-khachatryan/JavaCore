package classwork.threads.javaConcurrencyEssentials;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumCalculatorForkJoin extends RecursiveTask<Long> {

    private final int[] array;
    private final int start;
    private final int end;

    public SumCalculatorForkJoin(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start <= 1000) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            int mid = (start + end) / 2;
            SumCalculatorForkJoin leftTask = new SumCalculatorForkJoin(array, start, mid);
            SumCalculatorForkJoin rightTask = new SumCalculatorForkJoin(array, mid, end);

            leftTask.fork();
            long rightResult = rightTask.compute();
            long leftResult = leftTask.join();

            return leftResult + rightResult;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = i + 1;
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        long sum = forkJoinPool.invoke(new SumCalculatorForkJoin(array, 0, array.length));
        System.out.println("Sum: " + sum);
    }
}