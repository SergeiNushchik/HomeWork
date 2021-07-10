package HomeWork_6.iterator.api;

import java.util.Collection;

public interface Iterators<T> {
    void run( Collection<T> data);
    void remove(Collection<T> data);
}
