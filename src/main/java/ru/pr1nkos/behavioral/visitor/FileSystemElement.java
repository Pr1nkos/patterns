package ru.pr1nkos.behavioral.visitor;

/**
 * The interface File system element.
 */
public interface FileSystemElement {
    /**
     * Accept.
     *
     * @param visitor the visitor
     */
    void accept(FileSystemVisitor visitor);
}
