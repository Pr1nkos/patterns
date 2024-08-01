package ru.pr1nkos.behavioral.visitor;

import lombok.Getter;

@Getter
public class FileSystemSizeVisitor implements FileSystemVisitor {
    private int totalsize;

    @Override
    public void visit(FileClass file) {
        System.out.println(file.getFileName());
        totalsize += 1;
    }

    @Override
    public void visit(Directory directory) {
    }
}
