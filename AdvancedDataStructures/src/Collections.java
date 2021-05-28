package AdvancedDataStructures.src;

import java.util.HashMap;
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

    static void serveCustomer(LinkedList<Customer> queue)
    {
        //returns the first customer in the queue (pops the first element out of FIFO)
        Customer nextCustomer = queue.poll();
        nextCustomer.serve();
    }

    public static void main (String[] args)
    {
        //Queue
        LinkedList<Customer> queue = new LinkedList<Customer>();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Brian"));
        queue.add(new Customer("Ben"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);

        /* HashMap
         * When printed it does maintain the order.
         * Also Keys are Unique, and if we try to add two of the same keys to the hashmap, the previous value will be overwritten
         * Hasmaps also allow you to search for an entry with a certain key or value
        */
        HashMap<String, Integer> phonebook = new HashMap<String, Integer>();
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 8979);
        phonebook.put("Brenda", 4314);
        phonebook.put("Brenda", 2222);
        System.out.println(phonebook);
        if (phonebook.containsKey("Brenda"))
        {
            phonebook.remove("Brenda");
        }
        phonebook.clear();
        System.out.println(phonebook);

    }

   
}