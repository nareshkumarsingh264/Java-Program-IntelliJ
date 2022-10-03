package com.naresh;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Abhi");
        v.add("Raj");
        v.add("Jay");
        v.add("Vijay");
        v.add("Ram");
        System.out.println(v);
        // Get Element
        System.out.println(v.get(1));
        // Remove Element
        v.remove(3);
        System.out.println(v);
    }
}
