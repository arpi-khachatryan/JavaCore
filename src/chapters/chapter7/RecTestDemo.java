package chapters.chapter7;

public class RecTestDemo {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);

        for (int j = 0; j < 10; j++) {
            ob.values[j] = j;
        }
        ob.printArray(10);
    }
}
