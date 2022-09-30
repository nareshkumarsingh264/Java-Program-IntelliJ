package com.naresh;
import java.util.ArrayList;
public class ArrayLists2 {
    public static void main (String []args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(2);
        number.add(4);
        number.add(6);
        number.add(8);
        number.add(10);
         System.out.println("ArrayList:" +number);
         // remove element
        number.remove(1);
        System.out.println("Remove :" +number);
    }
}
