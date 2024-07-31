package ru.pr1nkos.structural.lightweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, Tree> trees = new HashMap<>();

    public static Tree getTree(String type) {
        Tree tree = trees.get(type);
        if (tree == null) {
            tree = new ConcreteTree(type);
            trees.put(type, tree);
        }
        return tree;
    }
}
