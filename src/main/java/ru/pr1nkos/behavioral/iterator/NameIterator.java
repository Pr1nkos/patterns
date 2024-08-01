package ru.pr1nkos.behavioral.iterator;

public class NameIterator implements Iterator {
    int index;
    NameRepository repo;

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
