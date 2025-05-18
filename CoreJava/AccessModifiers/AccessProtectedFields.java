package Assignment.AccessModifiers;

public class AccessProtectedFields extends ProtectedClassMethodsProblems {
    public static void main(String[] args) {
        // create object of this subclass
        AccessProtectedFields sub = new AccessProtectedFields();
        // access protected variable
        sub.name = "Protected Method in SubClass";
        // call protected method
        sub.protectedMethod();
    }

    // NOTE:
    // protected members can be accessed in same package directly,
    // and in other packages through child classes
}
