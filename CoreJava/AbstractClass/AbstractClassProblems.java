/*
 * 01. Create an abstract class with abstract and non-abstract methods.
 * 02. Create a subclass for an abstract class. Create an object in the child class for the
 * abstract class and access the non-abstract methods
 * 03. Create an instance for the child class in child class and call abstract methods
 * 04. Create an instance for the child class in child class and call non-abstract methods
 */

package Assignment.AbstractClass;

// Abstract class with both abstract and non-abstract methods
abstract class Animal {
    abstract void sound(); // Abstract method

    void eat() { // Non-abstract method
        System.out.println("Animal is eating");
    }
}

// Subclass of Animal
class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Lion roars");
    }
}

// Class with main method to test
public class AbstractClassProblems {
    public static void main(String[] args) {
        // Abstract class reference holding subclass object
        Animal animal = new Lion();
        animal.eat(); // Calling non-abstract method

        // Subclass object
        Lion lion = new Lion();
        lion.sound(); // Calling overridden method
        lion.eat();   // Calling inherited method
    }
}
