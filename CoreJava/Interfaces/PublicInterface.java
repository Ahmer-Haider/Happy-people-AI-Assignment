/*
 *08. Create a PUBLIC interface with fields and methods, fields should have values assigned.
 * Implement this interface to some class and print the values of the interface fields and
 * call the interface

 */
package Assignment.Interfaces;

public interface PublicInterface {
    int VALUE = 111;

    void showMessage();
}

class InterfaceImplementation implements PublicInterface {
    @Override
    public void showMessage() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        InterfaceImplementation obj = new InterfaceImplementation();
        System.out.println(VALUE);
        obj.showMessage();
    }
}

