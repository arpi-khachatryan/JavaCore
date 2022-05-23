package chapters.chapter5;

public class Menu {
    public static void main(String args[]) throws java.io.IOException {
        char choice;
        do {
            System.out.println("Տեղեկատու");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("Ընտրեք նախընտրելի համարը");
            choice = (char) System.in.read();
        }
        while (choice < '1' || choice > '2');
        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if(պայման) օպերատոր;");
                System.out.println("else օպերատոր;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch(արտահայտություն) {");
                System.out.println("case հաստատուն:");
                System.out.println("օպերատորների հաջորդականություն");
                System.out.println(" break; ");
                System.out.println(" // ...");
                System.out.println("}");
                break;
        }
    }
}
