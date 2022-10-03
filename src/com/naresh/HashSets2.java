package com.naresh;

import java.util.HashSet;

public class HashSets2 {
    public static void main (String []a){
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(4);
        numbers.add(7);
        System.out.println(numbers);
        // Remove element
        numbers.remove(5);
        System.out.println(numbers);
    }
}
