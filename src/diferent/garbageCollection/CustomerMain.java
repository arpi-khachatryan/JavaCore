package diferent.garbageCollection;

public class CustomerMain {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long availableBytes = runtime.freeMemory();
        System.out.println("Available memory: " + availableBytes / 1024 + "k");

        for (int i = 0; i < 100000000; i++) {
            Customer c;
            c = new Customer("John");
        }

        availableBytes = runtime.freeMemory();
        System.out.println("Available memory: " + availableBytes / 1024 + "k");

        System.gc();
        availableBytes = runtime.freeMemory();
        System.out.println("Available memory: " + availableBytes / 1024 + "k");
    }
}
