package oopgokhanrepo.day30Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<String>();

        q1.add("A");

        System.out.println(q1); // [A]

        System.out.println(q1.offer("B")); // true and element will be inserted
        System.out.println(q1.size()); //2

        // add method will throw exception, but offer method even when you have unlimited data, it will just give you false result
        //nm,zxcmasdhjbaxbjasdhas => add => trow exception
        //asdusiweiufmnxcvxnvxmncvb => offer => false


        Queue<String> q2 = new PriorityQueue<>();

        /*
        the difference between add() and offer()
        when adding elements to a collection with a capacity limit is that add()
        is a strict method that will always throw an exception if the collection is full,
        while offer() is an optional method that may return false
        if the element cannot be added due to capacity restrictions.
         */

    }
}
