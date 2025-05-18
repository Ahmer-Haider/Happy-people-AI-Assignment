/*
Problem 1. Create a class with PRIVATE fields, private method and a main method. Print the fields
 in main method. Call the private method in main method.
 Create a subclass and try to access the private fields and methods from subclass
*/

package Assignment.AccessModifiers;

public class PrivateFieldMethodProblems {
    // private variables
    private String name = "Ahmer Haider";
    private int age = 21;

    // private method
    private void pvtMethod() {
        System.out.println("My Name is " + name + " and my age is " + age);
    }

    // main method
    public static void main(String[] args) {
        PrivateFieldMethodProblems obj = new PrivateFieldMethodProblems();
        // print values
        System.out.println(obj.age);
        System.out.println(obj.name);
        // call private method
        obj.pvtMethod();
    }

    // Note: private members can’t be accessed in child classes
}

