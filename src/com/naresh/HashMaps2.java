package com.naresh;

import java.util.HashMap;

public class HashMaps2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();
        numbers.put(10,12);
        numbers.put(20,22);
        numbers.put(30,32);
        numbers.put(40,42);
        System.out.println(numbers);
        // remove element
        numbers.remove(10);
        System.out.println(numbers);
    }
}
