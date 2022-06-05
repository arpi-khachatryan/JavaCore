package homework;


import chapters.chapter7.StackClass;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;

    }

    public void check(StackClass stack) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '[' | chars[i] == ']' | chars[i] == ')') {
                stack.push(i);
            }
            if (chars[i] == ']') {
                stack.pop();
                System.out.println("Opened [ and closed ]");
            }
            if (chars[i] == ')') {
                stack.pop();
                System.out.println("Error: opened [ but closed ) at " + i);
            }
        }
    }
}





