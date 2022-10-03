package com.naresh;

import java.util.HashSet;

public class HashSets1 {
    public static void main (String []args){
        HashSet<String> set = new HashSet<String>();
        set.add("Ram");
        set.add("Jay");
        set.add("Veer");
        set.add("Varun");
        set.add("Jay");
        System.out.println(set);
        // Cantains element
        System.out.println(set.contains("Ram"));
    }
}
