package chapters.chapter11;

public class ThreeThread implements Runnable {
    Thread t;
    String name;

    ThreeThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("new thread " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " has ended");
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        new ThreeThread("one");
        new ThreeThread("two");
        new ThreeThread("three");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The main thread has ended");
    }
}
