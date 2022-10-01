package com.naresh;

import java.util.LinkedList;

public class LinkedLists1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println(ll);
        // add am element first
        ll.addFirst(0);
        System.out.println(ll);
    }
}
