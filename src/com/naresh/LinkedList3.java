package com.naresh;

import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(14);
        list.add(16);
        list.add(20);
        list.add(24);
        list.add(26);
        System.out.println(list);
        // Remove First element
        list.removeFirst();
        System.out.println(list);
    }
}
