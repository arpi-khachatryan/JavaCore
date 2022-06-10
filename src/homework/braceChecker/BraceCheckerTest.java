package homework.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker ob = new BraceChecker(")[Hello)[]({{from]}(Java])][");
        ob.check();
    }
}

