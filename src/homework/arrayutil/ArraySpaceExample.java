package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                for (int j = spaceArray.length - 1; j > i; j--) {
                    if (spaceArray[j] != ' ') {
                        char[] result = new char[j - i + 1];
                        for (int k = 0; k < result.length; k++) {
                            result[0] = spaceArray[i++];
                            System.out.print(result[0]);
                        }
                    }
                }
            }
        }
    }
}







