package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char c = ' ';
        for (int i = 1; i < spaceArray.length - 2; i++) {
            char[] result = new char[1];
            result[0] = spaceArray[i];
            System.out.print(result);
        }
    }
}

