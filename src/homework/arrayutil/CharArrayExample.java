package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {

        // first
        char[] chars = {'i', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println(count);

        // second
        char[] chars2 = {'i', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println(chars2[chars2.length / 2 - 1] + " " + chars2[chars2.length / 2]);

        // third
        char[] chars3 = {'i', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // forth
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        char name = 'b';
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == name && bobArray[i + 2] == name) {
                System.out.println("true");
                break;
            } else
                System.out.println("false");
        }

        // fifth
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}





