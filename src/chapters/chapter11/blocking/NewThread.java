package chapters.chapter11.blocking;

public class NewThread implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("նոր պատոկ " + t);
        suspendFlag = false;
        t.start();
    }

    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    wait();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " ընդհատվել է");
        }
        System.out.println(name + " ավարտվել է");
    }

    synchronized void mysuspend() {
        suspendFlag = false;

    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }

}

class SuspendRedume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("առաջին");
        NewThread ob2 = new NewThread("երկրորդ");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("առաջին պատոկի կանգնեցում");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("առաջին պատոկի վարականգնում");
            ob2.mysuspend();
            System.out.println("երկրորդ պատոկի կանգնեցում");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("երկրորդ պատոկի վարականգնում");
        } catch (InterruptedException e) {
            System.out.println("Գլխավոր պատոկը ընդհատվել է");
        }

        try {
            System.out.println();
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Գլխավոր պատոկը ընդհատվել է");
        }
        System.out.println("Գլխավոր պատոկը ավարտվել է");
    }
}