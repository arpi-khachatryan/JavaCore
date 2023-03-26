package classwork.threads.semaphore;

import java.util.concurrent.Semaphore;

public class Sem {
    public static void main(String[] args) {

        Semaphore table = new Semaphore(2);

        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person.table = table;
        person1.table = table;
        person2.table = table;
        person3.table = table;

        person.start();
        person2.start();
        person3.start();
    }
}

class Person extends Thread {

  Semaphore table;

    @Override
    public void run() {
        System.out.println(this.getName() + " waiting for a table");
        try {
            table.acquire();
            System.out.println(this.getName() + " eat at the table");
            System.out.println(this.getName() + " release table");
            Thread.sleep(1000);
            table.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}