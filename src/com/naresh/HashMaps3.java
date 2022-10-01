package com.naresh;

import java.util.HashMap;

public class HashMaps3 {
    public static void main(String[] args) {
        HashMap<String,Integer> People = new HashMap<String,Integer>();
        People.put("Raj",12);
        People.put("Jay",14);
        People.put("Vijay",20);
        People.put("Veer",16);
        System.out.println(People);
        // Clear element
        People.clear();
        System.out.println(People);
    }
}
