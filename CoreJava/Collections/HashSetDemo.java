package Assignment.Collections;

/**
 * @author JALA Academy
 *
 * Website Reference : https://java.jalaacademy.com/java/java_collections.html
 *
 * 3. Create a HashSet with at least 10 elements of type String
 * - Write program covering all the operations of HashSet
 */

import java.util.Iterator;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> jala = new HashSet<>();

        // a. Adding elements to the HashSet using add() method
        jala.add("zero");
        jala.add("one");
        jala.add("two");
        jala.add("three");
        jala.add("four");
        jala.add("five");
        jala.add("six");
        jala.add("seven");
        jala.add("eight");
        jala.add("nine");
        jala.add("ten");
        // Duplicate element 'nine' will not be added
        jala.add("nine");

        System.out.println("\nAfter adding elements to HashSet:");
        // HashSet doesn't maintain insertion order
        System.out.println("jala = " + jala);

        // b. Iterating through the HashSet using Iterator
        Iterator<String> itr = jala.iterator();
        System.out.println("\nIterating through the HashSet:");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // c. Create a clone/copy of HashSet using clone() method
        System.out.println("\nClone/copy of HashSet:");
        System.out.println(jala.clone());

        // d. Removing a specific element using remove() method
        jala.remove("zero");
        System.out.println("\nAfter removing element 'zero':");
        System.out.println("jala = " + jala);

        // e. Checking if the set is empty using isEmpty() method
        System.out.println("\nChecking if the set is empty:");
        System.out.println(jala.isEmpty());

        // f. Finding the size of the HashSet using size() method
        System.out.println("\nSize of the HashSet:");
        System.out.println(jala.size());

        // g. Checking if element is present in the HashSet using contains() method
        System.out.println("\nElement 'one' is present in the HashSet:");
        System.out.println(jala.contains("one"));

        // h. Removing all elements of the HashSet using clear() method
        System.out.println("\nAfter removing all elements of the HashSet:");
        jala.clear();
        System.out.println("jala = " + jala);
    }
}
