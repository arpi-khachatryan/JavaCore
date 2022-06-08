package chapters.chapter7;

public class PrivateStack {
    private int[] stck = new int[10];
    private int tos;

    PrivateStack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack if full");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is not full");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}