package classwork.patterns.iterator;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
