package tests;

//Գրել այնպիսի կլաս, որի օբյեկտից հնարավոր լինի սարքել մեկ հատ

public class Test3 {

    private static Test3 test = null;

    private Test3() {
        System.out.println("test");
    }

    public static Test3 getObj() {
        if (test == null) {
            test = new Test3();
        }
        return test;
    }

    public static void main(String[] args) {
        Test3 test3 = getObj();
    }
}
