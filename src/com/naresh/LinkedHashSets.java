package com.naresh;

import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(4);
        numbers.add(7);
        System.out.println(numbers);
        // Contains Element
        System.out.println(numbers.contains(3));
        //Remove Element
        numbers.remove(5);
        System.out.println(numbers);

    }
}
