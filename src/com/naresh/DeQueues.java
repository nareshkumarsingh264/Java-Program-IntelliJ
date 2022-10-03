package com.naresh;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.DelayQueue;

public class DeQueues {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("BMW");
        deque.add("HONDA");
        deque.add("VOLVO");
        deque.add("SAFARI");
        deque.add("HONDA");
        System.out.println(deque);
        //Rmove last Element

        deque.pollLast();
        System.out.println(deque);
        // Remove First Element
        deque.pollFirst();
        System.out.println(deque);
    }
}
