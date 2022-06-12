package homework.braceChecker;

public class BraceChecker2 {
    private String text;
    private final StackClass2 stack = new StackClass2();
    private final StackClass2 stackForIndex = new StackClass2();

    public BraceChecker2(String text) {
        this.text = text;
    }

    public void chack() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int x;

            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    stackForIndex.push(i);
                    break;
                case ')':
                    x = stack.pop();
                    if (x == 0) {
                        System.err.println("Error: closed at " + i + " " + c + " but not opened");
                    } else if (x != '(') {
                        System.err.println("Error: closed " + c + " at " + i + " but opened " + (char) x);
                    }
                    break;
                case '}':
                    x = stack.pop();
                    if (x == 0) {
                        System.err.println("Error: closed at " + i + " " + c + " but not opened");
                    } else if (x != '{') {
                        System.err.println("Error: closed " + c + " at " + i + " but opened " + (char) x);
                    }
                    break;
                case ']':
                    x = stack.pop();
                    if (x == 0) {
                        System.err.println("Error: closed at " + i + " " + c + " but not opened");
                    } else if (x != '[') {
                        System.err.println("Error: closed " + c + " at " + i + " but opened " + (char) x);
                    }
                    break;
            }
        }
        int last;
        while ((last = stack.pop()) != 0) {
            System.err.println("Error: opened " + (char) last + " " + stackForIndex.pop() + " but not closed");
        }
    }
}
