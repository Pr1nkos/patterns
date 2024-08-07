package ru.pr1nkos.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Tree factory.
 */
public class TreeFactory {
    private static final Map<String, Tree> trees = new HashMap<>();

    /**
     * Gets tree.
     *
     * @param type the type
     * @return the tree
     */
    public static Tree getTree(String type) {
        Tree tree = trees.get(type);
        if (tree == null) {
            tree = new ConcreteTree(type);
            trees.put(type, tree);
        }
        return tree;
    }
}
