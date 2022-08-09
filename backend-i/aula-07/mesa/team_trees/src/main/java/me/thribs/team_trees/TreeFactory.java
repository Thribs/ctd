package me.thribs.team_trees;

import java.util.HashMap;
import java.util.Map;

import me.thribs.team_trees.model.Tree;
import static me.thribs.team_trees.model.Tree.*;

public class TreeFactory {
    
    public static Map<String, Tree> trees = new HashMap<>();

    public static Tree getTree(String type) {
        double height;
        int age;
        String color;
        if (type == TYPE_ORNAMENTAL) {
            height = 200;
            age = 10;
            color = COLOR_GREEN;
        }
        else if (type == TYPE_FRUIT_BEARING) {
            height = 500;
            age = 20;
            color = COLOR_RED;
        }
        else if (type == TYPE_FLOWERING) {
            height = 100;
            age = 8;
            color = COLOR_BLUE;
        }
        else {
            throw new IllegalArgumentException("Invalid tree type");
        }

        Tree tree = new Tree(height, age, color);
        trees.put(type, tree);
        return tree;
    }
}
