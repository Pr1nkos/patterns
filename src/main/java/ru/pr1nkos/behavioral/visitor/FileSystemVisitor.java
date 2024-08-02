package ru.pr1nkos.behavioral.visitor;


/**
 * The interface File system visitor.
 */
public interface FileSystemVisitor {
    /**
     * Visit.
     *
     * @param file the file
     */
    void visit(FileClass file);

    /**
     * Visit.
     *
     * @param directory the directory
     */
    void visit(Directory directory);
}
