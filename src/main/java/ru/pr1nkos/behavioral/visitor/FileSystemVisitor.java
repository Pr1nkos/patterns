package ru.pr1nkos.behavioral.visitor;


public interface FileSystemVisitor {
    void visit(FileClass file);
    void visit(Directory directory);
}
