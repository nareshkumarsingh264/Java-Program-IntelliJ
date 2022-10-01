package com.naresh;

import java.util.LinkedList;

public class LinkedList6 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Pen");
        list.add("Copy");
        list.add("Pencil");
        list.add("Book");
        System.out.println(list);
         // Get last element
        System.out.println(list.getLast());
    }
}
