package ru.pr1nkos.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


/**
 * The type Text editor.
 */
public class TextEditor {
    private StringBuilder builder;

    /**
     * Instantiates a new Text editor.
     */
    public TextEditor() {
        builder = new StringBuilder();
    }

    /**
     * Write.
     *
     * @param text the text
     */
    public void write(String text) {
        builder.append(text);
    }

    /**
     * Save memento.
     *
     * @return the memento
     */
    public Memento save() {
        return new Memento(builder.toString());
    }

    /**
     * Restore.
     *
     * @param memento the memento
     */
    public void restore(Memento memento) {
        builder = new StringBuilder(memento.getContent());
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return builder.toString();
    }

    /**
     * The type Memento.
     */
    @AllArgsConstructor
    @Getter
    @EqualsAndHashCode
    @ToString
    public static final class Memento {
        private final String content;
    }
}
