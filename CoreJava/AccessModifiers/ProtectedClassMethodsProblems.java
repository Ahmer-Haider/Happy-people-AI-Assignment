/*
Problem 3. Create a class with PROTECTED fields and methods. Access these fields and methods
 from any other class in the same package.
*/

package Assignment.AccessModifiers;

public class ProtectedClassMethodsProblems {
    // protected variable
    protected String name;

    // protected method
    protected void protectedMethod() {
        System.out.println("This is a " + name);
    }
}

// accessing protected members from another class in same package
class ProtectedClass_03 {
    public static void main(String[] args) {
        // create object
        ProtectedClassMethodsProblems pc = new ProtectedClassMethodsProblems();
        // set value to protected variable
        pc.name = "Protected Method";
        // call protected method
        pc.protectedMethod();
    }
}

