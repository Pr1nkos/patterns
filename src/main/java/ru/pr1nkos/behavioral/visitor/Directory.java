package ru.pr1nkos.behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


/**
 * The type Directory.
 */
@Getter
public class Directory implements FileSystemElement {
    private String name;
    private List<FileSystemElement> elements = new ArrayList<>();

    /**
     * Instantiates a new Directory.
     *
     * @param name the name
     */
    public Directory(String name) {
        this.name = name;
    }


    /**
     * Add element.
     *
     * @param element the element
     */
    public void addElement(FileSystemElement element) {
        elements.add(element);
    }
    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
        for (FileSystemElement element : elements) {
            element.accept(visitor);
        }
    }
}
