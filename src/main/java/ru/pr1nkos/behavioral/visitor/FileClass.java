package ru.pr1nkos.behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The type File class.
 */
@AllArgsConstructor
@Getter
public class FileClass implements FileSystemElement{
    private String fileName;

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
