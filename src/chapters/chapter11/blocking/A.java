package chapters.chapter11.blocking;

public class A {

    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + "ը " + " մտավ A.foo() մեթոդ");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Class A-ն ընդհատվեց");
        }
        System.out.println(name + "ը " + " փորձում է կանչել B.last() մեթոդը");
        // b.last();
    }

    synchronized void last() {
        System.out.println("A.last() մեթոդում");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + "ը " + " մտավ B.bar() մեթոդ");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Class B-ն ընդհատվեց");
        }

        System.out.println(name + "ը " + " փորձում է կանչել A.last() մեթոդը");
        a.last();
    }
}

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName(" Գլխավոր պատոկ");
        Thread t = new Thread(this, " Մրցակցող պատոկ");
        t.start();

        a.foo(b);
        System.out.println(" Վերադարձ գլխավոր պատոկ");
    }

    public void run() {
        b.bar(a);
        System.out.println(" Վերադարձ մյուս պատոկ");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
