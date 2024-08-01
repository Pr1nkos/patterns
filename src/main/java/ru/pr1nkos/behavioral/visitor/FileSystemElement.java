package ru.pr1nkos.behavioral.visitor;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
