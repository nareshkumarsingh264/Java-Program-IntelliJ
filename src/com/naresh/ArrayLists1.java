package com.naresh;

import java.util.ArrayList;
import java.util.List;
public class ArrayLists1 {
    public static void main (String []a){
        List<String> list = new ArrayList<>();

        list.add("Ram");
        list.add("Shyam");
        list.add("Abhi");
        list.add("Raj");
        System.out.println(list);

        // get elemment

        System.out.println(list.get(0));
        // set
        list.set(1,"Ramesh");
        System.out.println(list);
    }
}
