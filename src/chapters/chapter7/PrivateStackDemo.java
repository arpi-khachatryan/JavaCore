package chapters.chapter7;

public class PrivateStackDemo {
    public static void main(String[] args) {
        PrivateStack ps1 = new PrivateStack();
        PrivateStack ps2 = new PrivateStack();

        for (int i = 0; i < 10; i++) {
            ps1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            ps2.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(ps1.pop() + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(ps2.pop() + " ");
        }
    }
}
