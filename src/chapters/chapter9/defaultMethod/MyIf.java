package chapters.chapter9.defaultMethod;

public interface MyIf {
    int getNumber();

    default String getString() {
        return "getString";
    }
}
