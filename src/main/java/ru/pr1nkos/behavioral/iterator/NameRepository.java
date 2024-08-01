package ru.pr1nkos.behavioral.iterator;

import lombok.Getter;

@Getter
public class NameRepository {
    private String[] names = {"John", "Ivan", "Serafim", "Lena"};

    public Iterator getIterator() {
        return new NameIterator(this);
    }
}
