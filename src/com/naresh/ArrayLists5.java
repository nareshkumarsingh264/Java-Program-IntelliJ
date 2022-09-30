package com.naresh;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayLists5 {
    public static void main (String []args){

    List<String> list = new ArrayList<>();

    list.add("jay");
    list.add("Vipin");
    list.add("Raj");
    list.add("Abhi");
    list.add("Raikesh");
    System.out.println("ArrayList:" + list);
   // Traversing list through Iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        // for each loop
        for(String str: list)
            System.out.println("for each loop:" +str);


        // contain element
    System.out.println(list.contains("jay"));

}
}