package classwork.patterns.iterator.iterator2;

import java.util.ArrayList;
import java.util.List;

public class NameCollection implements Container {

    private List<String> names;

    public NameCollection() {
        names = new ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
    }


    @Override
    public Iterator<String> getIterator() {
        return new NameIterator(names);
    }
}
