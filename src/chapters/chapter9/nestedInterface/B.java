package chapters.chapter9.nestedInterface;

public class B implements A.NestedIF {
    @Override
    public boolean isNotNegative(int x) {
        return x > 0 ? true : false;
    }
}
