package com.naresh;

import java.util.LinkedList;

public class LiinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BMW");
        cars.add("FORD");
        cars.add("VOLCO");
        cars.add("BOLERO");
        System.out.println(cars);
        // add an element last
        cars.addLast("HONDA");
        System.out.println(cars);
    }
}
