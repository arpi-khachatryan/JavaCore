package homework;

public class PracticeHomework {

    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    long convert(int minutes) {
        return (long) minutes * 60;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը
    int calcAge(int years) {
        return years * 365;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {
        return ++number;
    }

    //վերդարձնել true,եթե տրված a եւ b թվերը իրար հավասար են, եթե ոչ՝ false
    boolean isSameNum(int a, int b) {
        return a == b;
    }

    //վերդարձնել true,եթե տրված թիվը փոքր կամ հավասար է 0-ի, մնացած դեպքերում՝ false
    boolean lessThanOrEqualToZero(int number) {
        return number <= 0;
    }

    //վարադարձնել ընդունող բուլյանի ժխտված արժեքը
    boolean reverseBool(boolean value) {
        return !value;
    }

    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;
    }
}
