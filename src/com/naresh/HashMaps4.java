package com.naresh;

import java.util.HashMap;
public class HashMaps4 {
    public static void main (String []args){
        HashMap<String,Integer> people = new HashMap<String,Integer>();
        people.put("Abhi",13);
        people.put("Ram",14);
        people.put("Lakhan",15);
        people.put("Hari",16);
        System.out.println(people);
        // Size element
        System.out.println(people.size());
    }
}
