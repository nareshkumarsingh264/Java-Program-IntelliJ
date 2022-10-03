package com.naresh;

import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<String>();
        cars.add("BMW");
        cars.add("HONDA");
        cars.add("VOLVo");
        cars.add("SAFARI");
        cars.add("HONDA");
        System.out.println(cars);
        // Conttain Element
        System.out.println(cars.contains("HONDA"));
        // Remove Elemnet
        cars.remove("HONDA");
        System.out.println(cars);
        // Clear Element
        cars.clear();
        System.out.println(cars);
    }
}
