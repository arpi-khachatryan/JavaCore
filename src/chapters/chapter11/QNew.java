package chapters.chapter11;

public class QNew {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(n + "get");
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println(n);
        notify();
    }
}

class Producer2 implements Runnable {
    QNew q;

    Producer2(QNew q) {
        this.q = q;
        new Thread(this).start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer2 implements Runnable {
    QNew q;

    Consumer2(QNew q) {
        this.q = q;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}

class PCFixed {
    public static void main(String[] args) {
        QNew q = new QNew();
        new Producer2(q);
        new Consumer2(q);
        System.out.println("Control+C for stop");
    }
}