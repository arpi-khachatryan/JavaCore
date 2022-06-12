package homework.braceChecker;

public class StackClass2 {
    private int[] stck = new int[10];
    private int tos = -1;

    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
