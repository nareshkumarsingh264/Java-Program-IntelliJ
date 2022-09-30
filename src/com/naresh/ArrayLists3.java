package com.naresh;

import java.util.ArrayList;

public class ArrayLists3 {
    public static void main (String []args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Rajesh");
        list.add("Remesh");
        list.add("Jeet");
        list.add("Ravi");
        System.out.println("ArrayList:" + list);
        // Clear element
        list.clear();
        System.out.println("Clear:" + list );
    }
}
