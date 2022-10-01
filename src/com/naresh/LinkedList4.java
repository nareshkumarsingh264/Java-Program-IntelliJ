package com.naresh;

import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        // Remove  last element
        list.removeLast();
        System.out.println(list);
    }
}
