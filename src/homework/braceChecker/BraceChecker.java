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

        char[] newChar = stack.stck;
        stack.pop();
        for (int i = 0; i < stack.index; i++) {

            if (newChar[i] == '{' & newChar[++i] == '}') {
                System.out.println("Opened " + newChar[--i] + " and closed " + newChar[++i]);
            } else {
                System.out.println("Error: opened " + newChar[--i] + " but closed " + newChar[++i] + " at " + i);
            }

            if (newChar[i] == '(' & newChar[++i] == ')') {
                System.out.println("Opened " + newChar[--i] + " and closed " + newChar[++i]);
            } else {
                System.out.println("Error: opened " + newChar[--i] + " but closed " + newChar[++i] + " at " + i);
            }

            if (newChar[i] == '[' & newChar[++i] == ']') {
                System.out.println("Opened " + newChar[--i] + " and closed " + newChar[++i]);
            } else {
                System.out.println("Error: opened " + newChar[--i] + " but closed " + newChar[++i] + " at " + i);
            }
        }
    }
}



