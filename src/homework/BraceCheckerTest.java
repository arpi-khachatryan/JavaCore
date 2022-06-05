package homework;

import chapters.chapter7.StackClass;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "Hello from [Java)";
        BraceChecker ob = new BraceChecker(text);
        StackClass mystack = new StackClass();
        ob.check(mystack);
    }
}
