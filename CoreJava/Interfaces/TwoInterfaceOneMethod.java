/*
 * 04.Create two interfaces with one method each. Implement these two interfaces in one
 * class.
 */

package Assignment.Interfaces;

interface A3 {
    void methodOne();
}

interface A4 {
    void methodTwo();
}

public class TwoInterfaceOneMethod implements A3, A4 {
    @Override
    public void methodOne() {
        System.out.println("This is Method one");
    }

    @Override
    public void methodTwo() {
        System.out.println("This is Method two");
    }

    public static void main(String[] args) {
        TwoInterfaceOneMethod instance = new TwoInterfaceOneMethod();
        instance.methodOne();
        instance.methodTwo();
    }
}