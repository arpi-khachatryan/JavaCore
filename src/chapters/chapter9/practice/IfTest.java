package chapters.chapter9.practice;

public class IfTest {
    public static void main(String[] args) {
        IntStack mystack;

        FixedStack fa = new FixedStack(8);
        DynStack ds = new DynStack(5);

        mystack = fa;
        for (int i = 0; i < 8; i++) {
            mystack.push(i);
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(mystack.pop() + " ");
        }
        System.out.println();

        mystack = ds;
        for (int i = 0; i < 12; i++) {
            mystack.push(i);
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(mystack.pop() + " ");
        }
    }
}
