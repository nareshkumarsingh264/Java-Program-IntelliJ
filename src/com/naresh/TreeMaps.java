package com.naresh;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<String,String> city = new TreeMap<String,String>();

        city.put("Utter Pradesh","Lucknow");
        city.put("Rajasthan","Jaipur");
        city.put("Goa","Panji");
        city.put("Madhya Pradesh","Bhopal");
        System.out.println(city);
        //get element
        System.out.println(city.get("Utter Pradesh"));
        // Remove Element
        city.remove("Goa");
        System.out.println(city);
    }
}
