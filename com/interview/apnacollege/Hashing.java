package com.interview.apnacollege;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

    public static void main(String[] args) {

        //HashSet is a data structure which is very famous for its time complexity
        //Insert - O(1), Search - O(1), Delete - O(1)
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        //Printing all elements in the set
        System.out.println(set);

        //Search
        System.out.println(set.contains(1));

        //Delete
        System.out.println(set.remove(2));

        System.out.println(set);

        //Size of Set
        System.out.println(String.format("Size of Set is: %s",set.size()));

        //Iterator
        Iterator it = set.iterator();
        //hasNext() returns boolean value
        //next return object
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
