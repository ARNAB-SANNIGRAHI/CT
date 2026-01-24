package day14_CollectionFramework;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Print LinkedList
        System.out.println("LinkedList: " + list);

        // Add first and last
        list.addFirst("Grapes");
        list.addLast("Orange");

        // Read elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        
        System.out.println("Updated LinkedList1: "+list);

        // Remove elements
        list.removeFirst();
        list.removeLast();

        // Updated LinkedList
        System.out.println("Updated LinkedList2: " + list);
    }
}
