package com.naresh;

import java.util.HashSet;

public class HashSets3 {
    public static void main (String []a){
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(10);
        numbers.add(20);
        numbers.add(25);
        System.out.println(numbers);
        // Clear element
        numbers.clear();
        System.out.println("After Clear Element:"+ numbers);
    }
}
