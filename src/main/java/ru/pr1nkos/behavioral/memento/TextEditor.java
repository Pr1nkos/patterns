package ru.pr1nkos.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


public class TextEditor {
    private StringBuilder builder;

    public TextEditor() {
        builder = new StringBuilder();
    }

    public void write(String text) {
        builder.append(text);
    }

    public Memento save() {
        return new Memento(builder.toString());
    }

    public void restore(Memento memento) {
        builder = new StringBuilder(memento.getContent());
    }

    public String getContent() {
        return builder.toString();
    }

    @AllArgsConstructor
    @Getter
    @EqualsAndHashCode
    @ToString
    public static final class Memento {
        private final String content;
    }
}
