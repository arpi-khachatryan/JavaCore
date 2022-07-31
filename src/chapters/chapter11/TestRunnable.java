package chapters.chapter11;

public class TestRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Runner());
        t.start();
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}