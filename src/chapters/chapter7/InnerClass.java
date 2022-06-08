package chapters.chapter7;

public class InnerClass {
    int innerClass = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("innerClass = " + innerClass);
        }
    }
}