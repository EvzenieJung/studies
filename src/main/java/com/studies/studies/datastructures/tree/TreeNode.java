package com.studies.studies.datastructures.tree;

import java.util.ArrayList;

public class TreeNode {

    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }

    public String print(int level) {
        var ret = new StringBuilder(" ".repeat(level) + data + "\n");
        for (TreeNode child : children) {
            ret.append(child.print(level + 1));
        }
        return ret.toString();
    }

    public String printRep(int level) {
        var ret = new StringBuilder(" ".repeat(level) + data + "\n");
        for(TreeNode child : children) {
            ret.append(child.print(level+1));
        }
        return ret.toString();
    }
}
