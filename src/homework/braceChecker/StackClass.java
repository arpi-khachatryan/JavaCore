package homework.braceChecker;

public class StackClass {
    public char[] stck = new char[25];
    public int index = 0;

    public void push(char volume) {
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
