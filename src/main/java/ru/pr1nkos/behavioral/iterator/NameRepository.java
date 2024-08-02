package ru.pr1nkos.behavioral.iterator;

import lombok.Getter;

/**
 * The type Name repository.
 */
@Getter
public class NameRepository {
    private String[] names = {"John", "Ivan", "Serafim", "Lena"};

    /**
     * Gets iterator.
     *
     * @return the iterator
     */
    public Iterator getIterator() {
        return new NameIterator(this);
    }
}
