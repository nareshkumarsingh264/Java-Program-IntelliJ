package com.naresh;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main (String []args){
        Set<String> people = new HashSet<>();
        people.add("Raj");
        people.add("Abhi");
        people.add("Ravi");
        people.add("Jeet");
        people.add("Raj");
        System.out.println(people);

    }
}
