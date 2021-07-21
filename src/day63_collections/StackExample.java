package day63_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

//LIFO-- LAST IN FIRST OUT
        Stack<String> booksStack = new Stack<>();
        System.out.println("HARRY POTTER");

        booksStack.add("Leaders eat last");
        booksStack.add("java intro");

        booksStack.push("cucumber");
        System.out.println(booksStack);
        System.out.println(booksStack.remove(0));

       // booksStack.pop();//removes & returns the top of the stack item
       // System.out.println(booksStack.pop());
        System.out.println(booksStack);

//                                                                 peek help to show whats on top
        System.out.println("This is at the top of the " + booksStack.peek());
        System.out.println("Final versions: " + booksStack);



    }
}