package homework.braceChecker;

public class StackClass {
    public char[] stck = new char[30];
    public int index = -1;


    public void push(char value) {
        if (index == stck.length-1) {
            System.out.println("Stack is full");
        } else {
            stck[++index] = value;

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
