package homework.braceChecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;

    }

    public void check(StackClass stack) {
        char[] chars = text.toCharArray();
        String text = this.text;

        for (int i = 0; i < chars.length; i++) {
            char c = text.charAt(i);
            if (c == '[' | c == ']' | c == ')' | c == '(' | c == '{' | c == '}') {
                stack.push(c);
            }

        }

        char[] l = stack.stck;
        stack.pop();
        for (int i = 0; i < stack.index; i++) {

            if (l[i] == '{' & l[++i] == '}') {
                System.out.println("Opened " + l[--i] + " and closed " + l[++i]);
            } else {
                System.out.println("Error: opened " + l[--i] + " but closed " + l[++i] + " at " + i);
            }

            if (l[i] == '(' & l[++i] == ')') {
                System.out.println("Opened " + l[--i] + " and closed " + l[++i]);
            } else {
                System.out.println("Error: opened " + l[--i] + " but closed " + l[++i] + " at " + i);
            }
        }
    }
}



