package com.naresh;

import java.util.PriorityQueue;

public class Queues {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("BMW");
        queue.add("HONDA");
        queue.add("VOLVO");
        queue.add("SAFARI");
        queue.add("HONDA");
        System.out.println(queue);
        // Remove Element
        queue.remove();
       queue.poll();
        System.out.println(queue);
    }
}
