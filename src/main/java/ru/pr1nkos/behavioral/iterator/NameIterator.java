package ru.pr1nkos.behavioral.iterator;

/**
 * The type Name iterator.
 */
public class NameIterator implements Iterator {
    /**
     * The Index.
     */
    int index;
    /**
     * The Repo.
     */
    NameRepository repo;

    /**
     * Instantiates a new Name iterator.
     *
     * @param nameRepository the name repository
     */
    public NameIterator(NameRepository nameRepository) {
        repo = nameRepository;
    }

    @Override
    public boolean hasNext() {
        return index < repo.getNames().length;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return repo.getNames()[index++];
        }
        return null;
    }
}
