package com.studies.studies.datastructures.tree;

public class Client {

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");

        drinks.addChild(hot);
        drinks.addChild(cold);

        System.out.println(drinks.print(0));

        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        hot.addChild(tea);
        hot.addChild(coffee);

        System.out.println(drinks.print(0));

        TreeNode icedTea = new TreeNode("Iced Tea");
        TreeNode beer = new TreeNode("Beer");

        cold.addChild(icedTea);
        cold.addChild(beer);

        System.out.println(drinks.print(0));
    }
}
