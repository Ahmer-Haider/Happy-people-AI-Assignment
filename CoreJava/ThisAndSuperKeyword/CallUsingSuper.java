/*
 * 2. Print the fields/instance members of the parent class using super
 * 5. Call constructor of the parent class using super()
 */

package Assignment.ThisAndSuperKeyword;

class Parent {
    String name = "Ahmer";

    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    String name = "Jala";

    Child() {
        super();
        System.out.println("Child class constructor");
    }

    void displayParentName() {
        System.out.println("Parent name: " + super.name);
    }
}


public class CallUsingSuper {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayParentName();
    }
}
