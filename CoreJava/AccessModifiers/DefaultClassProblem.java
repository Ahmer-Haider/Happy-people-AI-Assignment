/*
Problem 2. Create a class with DEFAULT fields and methods. Access these fields and methods
from any other class in the same package
*/
package Assignment.AccessModifiers;

class DefaultClass {
    // default variables
    int myAge;
    String myName;

    // default method
    void defaultMethod() {
        System.out.println("My name is " + myName + " and my age is " + myAge);
    }
}
public class DefaultClassProblem {
    public static void main(String[] args) {
        // creating object
        DefaultClass obj = new DefaultClass();

        // setting values
        obj.myAge = 21;
        obj.myName = "Ahmer Haider";

        // calling method
        obj.defaultMethod();
    }
}
