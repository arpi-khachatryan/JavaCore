package classwork.patterns.iterator.iterator2;

import java.util.List;

public class NameIterator implements Iterator<String> {

    private List<String> names;
    private int index;

    public NameIterator(List<String> names) {
        this.names = names;
        index = 0;
    }

    public boolean hasNext() {
        return index < names.size();
    }

    public String next() {
        if (hasNext()) {
            String name = names.get(index);
            index++;
            return name;
        }
        return null;
    }
}
