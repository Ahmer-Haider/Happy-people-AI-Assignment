/*
Problem 4. Create a class with PUBLIC fields and methods.
Access the public methods and fields from any class in the same package or different
package
 */

package Assignment.AccessModifiers;

// class with public variables and method
class PublicClass_04 {
    // public variable
    public String pName = "Public";

    // public method
    public void publicMethod() {
        System.out.println("This is " + pName);
    }
}

public class PublicClassMethodsProblems {
    public static void main(String[] args) {
        // create object
        PublicClass_04 pub = new PublicClass_04();
        // set value to public variable
        pub.pName = "Public Method";
        // call public method
        pub.publicMethod();
    }
}
