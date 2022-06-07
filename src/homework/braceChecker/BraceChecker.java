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

        char[] newChars = stack.stck;
        while (newChars.length > 0) {

            if (newChars[stack.index] == ']') {
                stack.pop();
                if (newChars[stack.index] == '[') {
                    --stack.index;
                }
                if (newChars[stack.index] == '(') {
                    System.out.println("Error: opened " + newChars[stack.index] + " and closed " + newChars[++stack.index] + " at " + stack.index);
                    stack.index -= 2;
                }
                if (newChars[stack.index] == '{') {
                    System.out.println("Error: opened " + newChars[stack.index] + " and closed " + newChars[++stack.index] + " at " + stack.index);
                    stack.index -= 2;
                }
            }

            if (newChars[stack.index] == ')') {
                stack.pop();
                if (newChars[stack.index] == '(') {
                    --stack.index;
                }
                if (newChars[stack.index] == '{') {
                    System.out.println("Error: opened " + newChars[stack.index] + " and closed " + newChars[++stack.index] + " at " + stack.index);
                    stack.index -= 2;
                }
                if (newChars[stack.index] == '[') {
                    System.out.println("Error: opened " + newChars[stack.index] + " and closed " + newChars[++stack.index] + " at " + stack.index);
                    stack.index -= 2;
                }
            }

            if (newChars[stack.index] == '}') {
                stack.pop();
                if (newChars[stack.index] == '{') {
                    --stack.index;
                }
                if (newChars[stack.index] == '(') {
                    System.out.println("Error: opened " + newChars[stack.index] + " and closed " + newChars[++stack.index] + " at " + stack.index);
                    stack.index -= 2;
                }
                if (newChars[stack.index] == '[') {
                    System.out.println("Error: opened " + newChars[stack.index] + " and closed " + newChars[++stack.index] + " at " + stack.index);
                    stack.index -= 2;
                }
            }
        }
    }
}








