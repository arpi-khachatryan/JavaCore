package classwork.threads.javaConcurrencyEssentials;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class HungryPerson extends Thread {

    private int personID;
    private static Lock slowCookerLid = new ReentrantLock();

    private static int servings = 11;

    private static Condition soupTaker = slowCookerLid.newCondition();

    public HungryPerson(int personId) {
        this.personID = personId;

    }

    @Override
    public void run() {
        while (servings > 0) {
            slowCookerLid.lock();
            try {
                while ((personID != servings % 5) && servings > 0) { //check if it is your tern
                    System.out.format("Person %d checked... then put the lid back.\n", personID);
                    soupTaker.await();
                }
                if (servings > 0) {
                    servings--;//it is your turn - take some soup!
                    System.out.format("person %d took some soup! Servings left: %d\n", personID, servings);
//                    soupTaker.signal();
                    soupTaker.signalAll();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                slowCookerLid.unlock();
            }
        }
    }
}

public class ConditionVariableDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new HungryPerson(i).start();
        }
    }
}
