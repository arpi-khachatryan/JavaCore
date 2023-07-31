package classwork.threads.javaConcurrencyEssentials;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteLock extends Thread {

    private static final String[] WEEKDAYS = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private static int today = 0;
    //    private static ReentrantLock marker = new ReentrantLock();
    private static ReentrantReadWriteLock marker = new ReentrantReadWriteLock();
    private static Lock readMarker = marker.readLock();
    private static Lock writeMarker = marker.writeLock();

    public ReadWriteLock(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        while (today < WEEKDAYS.length - 1) {
            if (this.getName().contains("Writer")) { //update the shard calendar
//                marker.lock();
                writeMarker.lock();
                try {
                    today = (today + 1) % 7;
                    System.out.println(this.getName() + " update date to " + WEEKDAYS[today]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                {
//                    marker.unlock();
                    writeMarker.unlock();
                }
            } else { //Reader - check to see what today is
//                marker.lock();
                readMarker.lock();
                try {
//                    System.out.println(this.getName() + " sees that today is " + WEEKDAYS[today]);
                    System.out.println(this.getName() + " sees that today is " + WEEKDAYS[today] + "; total readers; " + marker.getReadLockCount());
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
//                    marker.unlock();
                    readMarker.unlock();
                }
            }
        }
    }
}

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        // create ten reader threads

        for (int i = 0; i < 10; i++) {
            new ReadWriteLock("Reader-" + i).start();

            // ...but only two writer threads
            for (int j = 0; j < 2; j++) {
                new ReadWriteLock("Writer-" + i).start();
            }
        }
    }
}