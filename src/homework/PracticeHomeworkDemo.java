package homework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework practice = new PracticeHomework();

        System.out.println("Վայրկյանները" + " " + practice.convert(2));
        System.out.println("Օրերի քանակը" + " " + practice.calcAge(2));
        System.out.println("Տրված թվի հաջորդ թիվը" + " " + practice.nextNumber(1));
        System.out.println(practice.isSameNum(2, 2));
        System.out.println(practice.lessThanOrEqualToZero(0));
        System.out.println("Ընդունող բուլյանի ժխտված արժեքը " + " " + practice.reverseBool(false));
        System.out.println("Ամենամեծ length-ը" + " " + practice.maxLength(new int[3], new int[7]));
    }
}
