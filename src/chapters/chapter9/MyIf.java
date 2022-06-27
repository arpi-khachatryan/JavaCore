package chapters.chapter9;

public interface MyIf {
    int getNumber();

    default String getString() {
        return "getString";
    }

    static int getDefaultNumber() {
        return 0;
    }
}
