package com.naresh;

import java.util.HashMap;

public class HashMaps5 {
    public static void main (String []args){
        HashMap<String,String> city = new HashMap<String,String>();
        city.put("Japan","Tokyo" );
        city.put("India","Delhi");
        city.put("America", "Washigton");
        city.put("Germany","Berlin");
        // for each key
        for(String str: city.keySet()){
            System.out.println(str);
        }
        // for each value
       for(String str: city.values()){
           System.out.println(str);
       }
       // for each key value
       for(String i: city.keySet()) {
           System.out.println("Key: "+ i + " Value: " + city.get(i));
        }
        }

    }

