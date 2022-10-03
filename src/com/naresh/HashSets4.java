package com.naresh;

import java.util.HashSet;

public class HashSets4 {
    public static void main (String []args){
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(50);
        numbers.add(70);
        System.out.println(numbers);
        // Size of element
        System.out.println(numbers.size());
         // For each loop
        for(Integer i: numbers){
            System.out.println(i);
        }
    }
}
