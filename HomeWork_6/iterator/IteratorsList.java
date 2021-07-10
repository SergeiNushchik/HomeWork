package HomeWork_6.iterator;

import HomeWork_6.iterator.api.Iterators;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorsList<T> implements Iterators<T> {

    @Override
    public void run(Collection<T> data) {
        Iterator<T> iterator = data.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }

    @Override
    public void remove(Collection<T> data) {
        Iterator<T> iterator = data.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }
}

