package chapters.chapter11;

public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "new thread");
        System.out.println(t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread has ended");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("main thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The main thread has ended");
    }
}
