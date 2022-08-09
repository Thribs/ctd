package me.thribs.team_trees;

import static me.thribs.team_trees.model.Tree.*;
import static me.thribs.team_trees.TreeFactory.getTree;

public class App {
    public static void main(String[] args) {
        getTree(TYPE_ORNAMENTAL);
        getTree(TYPE_FRUIT_BEARING);
        getTree(TYPE_FLOWERING);

        // loop 10 million
        for (int i = 0; i < 10000000; i++) {
            // get a random tree type between ornamental, fruit bearing, and flowering
            String type = Math.random() < 0.33 ? TYPE_ORNAMENTAL : Math.random() < 0.66 ? TYPE_FRUIT_BEARING : TYPE_FLOWERING;
            System.out.println(getTree(type).toString());
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}
