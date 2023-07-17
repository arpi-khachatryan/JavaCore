package classwork.threads.javaConcurrencyEssentials;

public class ExecutionScheduling extends Thread {

    public int vegetableCount = 0;
    public static boolean chopping = true;

    public ExecutionScheduling(String name) {
        this.setName(name);
    }

    public void run() {
        while (chopping) {
            System.out.println(this.getName() + " chopped a vegetable!");
            vegetableCount++;
        }
    }
}

class ExecutionSchedulingDemo {
    public static void main(String[] args) throws InterruptedException {

        ExecutionScheduling barron = new ExecutionScheduling("Barron");
        ExecutionScheduling olivia = new ExecutionScheduling("Olivia");

        barron.start();
        olivia.start();
        Thread.sleep(1000);
        ExecutionScheduling.chopping = false;

        barron.join();
        olivia.join();
        System.out.format("Barron chopped %d vegetables.\n", barron.vegetableCount);
        System.out.format("Olivia chopped %d vegetables.\n", barron.vegetableCount);
    }
}
