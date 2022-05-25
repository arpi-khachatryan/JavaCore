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

        // or
        System.out.println();

        int startIndex = 0;
        int endIndex = spaceArray.length - 1;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[startIndex] == ' ') {
                startIndex++;
            } else {
                break;
            }
        }

        for (int i = endIndex; i > 0; i--) {
            if (spaceArray[endIndex] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }

        int newlength = endIndex - startIndex + 1;
        char[] result = new char[newlength];
        int x = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[x++] = spaceArray[i];
        }

        for (char i : result) {
            System.out.print(i);
        }
    }
}







