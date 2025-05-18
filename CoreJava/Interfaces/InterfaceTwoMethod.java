/*
 * 02. Create an interface with two methods, but implement only one in a class. Call the
 * method implemented.
 */
package Assignment.Interfaces;

interface A2 {
    void methodOne();
    void methodTwo();
}

public class InterfaceTwoMethod implements A2 {
    @Override
    public void methodOne() {
        System.out.println("First Method");
    }

    @Override
    public void methodTwo() {
        System.out.println("Second Method");
    }

    public static void main(String[] args) {
        InterfaceTwoMethod instance = new InterfaceTwoMethod();
        instance.methodOne();
        instance.methodTwo();
    }
}

/*
 * Note:
 * A class implementing an interface must override all its methods.
 */
