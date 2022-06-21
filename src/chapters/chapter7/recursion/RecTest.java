package chapters.chapter7.recursion;

public class RecTest {

    int values[];

    RecTest(int k) {
        values = new int[k];
    }

    void printArray(int i) {
        if (i == 0) {
            return;
        } else {
            printArray((i - 1));
            System.out.println("[" + (i - 1) + "]" + " " + values[i - 1]);
        }
    }
}
