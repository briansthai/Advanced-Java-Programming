package AdvancedDataStructures.src;

import java.util.LinkedList;

public class Collections
{
    /* 
     * Determining which collection to use
     * Does order matter?
     * Are duplicates allowed?
     * How fast can it perform? Different types of collections take different amounts of time
     * How much memory usage?
     * http://www.sergiy.ca/guide-to-selecting-appropriate-map-collection-in-java
    */

    /*
     * The top of  the hierarchy is Iterable and all collections implement Iterable and declares the forEach method.
     * Next is the Collection interface, which extends Iterable.
     * There is another layer of interfaces named Set, List, and Queue
     * Set - No duplicates, unordered
     * List - Duplicates are allowed, order matters
     * Queue - FIFO
     * Maps - does not extend collection interface, key-value pairs
    */

    /*
     * Linked Lists
     * Doubly linked collection of elements
     * Each entry has a reference to the next and previous items in the list.
     * Advantage: quick for insertion and removing elements in the middle of a list
     * 
     * Linked lists are comparable to Array list but 
     * for insertion of many elements in the middle of the list, or removing lots of elements from the middle Linked lists are faster
     * for getting elements from the list an Array list is faster
     * for memory usage, linked lists take up more memory because it contains references to elements in the list and the previous and next element
    */

    public static void linkedLists()
    {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);
    }

    /*
     * Queue 
     * FIFO structures and useful to control access to shared resources
    */
}