package day63_collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("One");
        queue.add("two");
        queue.add("thee");
        queue.add("four");
        queue.add("five");

        System.out.println(queue.element());// line 12 and line 13 do the some thing
        System.out.println(queue.peek());

        System.out.println(queue.remove());//remove top element- difference between line 19n&20
                                            // remove will give us NosuchElementException
        System.out.println(queue.poll());// removes top element- if empty then we will get null answer
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
