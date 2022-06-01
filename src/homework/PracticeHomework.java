package homework;

public class PracticeHomework {

    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    long convert(int minutes) {
        int seconds = 0;
        if (minutes >= 1) {
            seconds = minutes * 60;
        }
        return seconds;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը
    int calcAge(int years) {
        int days = 0;
        if (years >= 1) {
            days = years * 365;
        }
        return days;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {
        return ++number;
    }

    //վերդարձնել true,եթե տրված a եւ b թվերը իրար հավասար են, եթե ոչ՝ false
    boolean isSameNum(int a, int b) {
        boolean t;
        if (a == b) {
            t = true;
        } else {
            t = false;
        }
        return t;
    }

    //վերդարձնել true,եթե տրված թիվը փոքր կամ հավասար է 0-ի, մնացած դեպքերում՝ false
    boolean lessThanOrEqualToZero(int number) {
        boolean t;
        if (number <= 0) {
            t = true;
        } else {
            t = false;
        }
        return t;
    }

    //վարադարձնել ընդունող բուլյանի ժխտված արժեքը
    boolean reverseBool(boolean value) {
        return !value;
    }

    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    int maxLength(int[] array1, int[] array2) {
        int length = 0;
        if (array1.length > array2.length) {
            length = array1.length;
        } else {
            length = array2.length;
        }
        return length;
    }
}