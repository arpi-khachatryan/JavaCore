package homework.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "[Hello)[]{from] (Java]";
        BraceChecker ob = new BraceChecker(text);
        StackClass mystack = new StackClass();
        ob.check(mystack);
    }
}
