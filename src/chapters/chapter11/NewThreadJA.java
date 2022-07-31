package chapters.chapter11;

public class NewThreadJA implements Runnable {
    String name;
    Thread t;

    NewThreadJA(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread " + t);
        t.start();
    }

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

class DemoJoin {
    public static void main(String[] args) {
        NewThreadJA ob1 = new NewThreadJA("one");
        NewThreadJA ob2 = new NewThreadJA("two");
        NewThreadJA ob3 = new NewThreadJA("three");

        System.out.println("thread one: " + ob1.t.isAlive());
        System.out.println("thread two: " + ob2.t.isAlive());
        System.out.println("thread three: " + ob3.t.isAlive());

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("The main thread has ended");
        }
        System.out.println("thread one: " + ob1.t.isAlive());
        System.out.println("thread two: " + ob2.t.isAlive());
        System.out.println("thread three: " + ob3.t.isAlive());

        System.out.println("The main thread has ended");
    }
}
