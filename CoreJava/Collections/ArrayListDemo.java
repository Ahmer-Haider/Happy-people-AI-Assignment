package Assignment.Collections;

/**
 * 1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to
 * ArrayList and perform the below operations
 * - a. Add an element to the ArrayList
 * - b. Iterate through the ArrayList by using Iterator object
 * - c. Add an element at a specific index
 * - d. Remove an element from the ArrayList, Remove at an index
 * - e. Update the element at a specific index
 * - f. Check the element is present at a particular index
 * - g. Get an element at a particular index
 * - h. Find out the size of the ArrayList
 * - i. Check the given element is present in the ArrayList
 * - j. Remove all elements of the ArrayList
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("zero", "one", "two", "three", "four", "five"));

        // a. Add elements
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");

        System.out.println("After adding elements: " + list);

        // b. Iterate using Iterator
        Iterator<String> itr = list.iterator();
        System.out.print("Iterating: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // c. Add element at index 1
        list.add(1, "AtIndex1");
        System.out.println("After adding at index 1: " + list);

        // d. Remove element at index 1
        list.remove(1);
        System.out.println("After removing element at index 1: " + list);

        // e. Update element at index 1
        list.set(1, "ONE");
        System.out.println("After updating element at index 1: " + list);

        // f. Check index of element "three"
        System.out.println("Index of 'three': " + list.indexOf("three"));

        // g. Get element at index 3
        System.out.println("Element at index 3: " + list.get(3));

        // h. Size of ArrayList
        System.out.println("Size of list: " + list.size());

        // i. Check if 'two' is present
        System.out.println("'two' present: " + list.contains("two"));

        // j. Remove all elements
        list.clear();
        System.out.println("After clearing: " + list);
    }
}

