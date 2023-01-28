package com.company;


public class Main {

    public static void main(String[] args) {
        com.company.Tree IntTree = new com.company.Tree();
        IntTree.insert(24);
        IntTree.insert(21);
        IntTree.insert(14);
        IntTree.insert(28);
        IntTree.insert(32);
        IntTree.insert(27);
        IntTree.insert(25);
        IntTree.insert(20);
        IntTree.insert(33);

        IntTree.traverseInOrder();
        System.out.println();

        System.out.println(IntTree.get(28));
        System.out.println(IntTree.get(32));
        
        System.out.println(IntTree.max());
        System.out.println(IntTree.min());
        System.out.println("\n\n");

    }

}
