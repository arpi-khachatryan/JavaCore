package chapters.chapter7;

public class Inner {
    int inner = 100;

    void test() {
        for (int i = 0; i < 10; i++) {

            class InnerClass {
                void display() {
                    System.out.println("inner = " + inner);
                }
            }
            InnerClass ic = new InnerClass();
            ic.display();
        }
    }
}
