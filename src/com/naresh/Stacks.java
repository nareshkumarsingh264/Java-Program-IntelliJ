package com.naresh;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Horse");
        animals.push("Goat");
        System.out.println(animals);
        // Access Element

        System.out.println(" Element of top:" +animals.peek());
        // Remove Element

        System.out.println("Removed Element:" + animals.pop());
        // Search Element

        System.out.println(" Posotion of Element:" + animals.search("Dog"));

    }
}
