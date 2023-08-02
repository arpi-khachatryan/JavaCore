package classwork.threads.javaConcurrencyEssentials;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class RecursiveSum extends RecursiveTask<Long> {

    private long io, hi;

    public RecursiveSum(long io, long hi) {
        this.io = io;
        this.hi = hi;
    }

    @Override
    protected Long compute() {
        if (hi - io <= 100_000) { //base case threshold
            long total = 0;
            for (long i = 0; i <= hi; i++) {
                total += i;
            }
            return total;
        } else {
            long mid = (hi + io) / 2; //middle index for split
            RecursiveSum left = new RecursiveSum(io, mid);
            RecursiveSum right = new RecursiveSum(mid + 1, hi);
            left.fork(); // forked thread computes left half
            return right.compute() + left.join();//current thread computes right half
        }
    }
}

public class DivideAndConquerDemo {
    public static void main(String[] args) {
        ForkJoinPool pool = ForkJoinPool.commonPool();
        Long total = pool.invoke(new RecursiveSum(0, 1000));
        pool.shutdown();
        System.out.println("Total sim is " + total);
    }
}
