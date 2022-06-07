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
        if (newChars[stack.index] == ']') {
            stack.pop();
            if (newChars[stack.index] == '[') {
            } else {
                System.out.println("Error: opened " + newChars[--stack.index] + " closed at  ] " + ++stack.index);
            }

            stack.pop();
            if (newChars[stack.index] == '}') {
                if (newChars[stack.index] == '{') {
                } else {
                    System.out.println("Error: opened " + newChars[--stack.index] + " closed at  } " + ++stack.index);

                }

                stack.pop();
                if (newChars[stack.index] == ')') {
                    if (newChars[stack.index] == '(') {
                    } else {
                        System.out.println("Error: opened " + newChars[--stack.index] + " closed at  ) " + ++stack.index);
                    }
                }
            }
        }
    }
}


