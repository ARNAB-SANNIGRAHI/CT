package day14_CollectionFramework;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> v = new Vector<String>();

        // Add elements
        v.add("Java");
        v.add("Python");
        v.add("C++");

        // Print Vector
        System.out.println("Vector: " + v);

        // Read element
        System.out.println("Element at index 1: " + v.get(1));

        // Update element
        v.set(1, "JavaScript");

        // Remove element
        v.remove("C++");

        // Updated Vector
        System.out.println("Updated Vector: " + v);
    }
}
