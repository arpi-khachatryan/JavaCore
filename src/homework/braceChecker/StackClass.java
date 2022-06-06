package homework.braceChecker;

public class StackClass {
    public int[] stck = new int[10];
    public int index = -1;

    public void push(int volume) {
        if (index == stck.length) {
            System.out.println("Stack is full");
        } else {
            stck[++index] = volume;
        }
    }

    public int pop() {
        if (index < 0) {
            System.out.println("Stack is full");
            return 0;
        } else {
            return stck[index--];
        }
    }
}
