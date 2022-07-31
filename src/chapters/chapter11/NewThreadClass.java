package chapters.chapter11;

public class NewThreadClass extends Thread {
    NewThreadClass() {
        super("thread");
        System.out.println("new thread " + this);
        start();
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

class ExtendThread {
    public static void main(String[] args) {
        new NewThreadClass();
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
