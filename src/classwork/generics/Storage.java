package classwork.generics;

public class Storage<T> {
    private Object[] object = new Object[10];
    private int size = 0;

    public void add(T obj) {
        if (size == object.length) {
            extend();
        }
        object[size++] = obj;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(object[i]);
        }
    }

    public T getByIndex(int index) {
        return (T) object[index];
    }

    private void extend() {
        Object[] newObject = new Object[object.length + 10];
        System.arraycopy(object, 0, newObject, 0, size);
        object = newObject;
    }
}
