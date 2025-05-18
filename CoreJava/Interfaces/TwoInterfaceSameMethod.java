/*
 * 05. Create two interfaces with the same method (same signature) in both the interfaces.
 * Implement these two interfaces in one class. Call the method.
 */

package Assignment.Interfaces;


interface A5 {
    void sameMethod();
}

interface A6 {
    void sameMethod();
}

class TwoInterfaceSameMethod implements A5, A6 {
    @Override
    public void sameMethod() {
        System.out.println("This is same method in both the interfaces");
    }

    public static void main(String[] args) {
        TwoInterfaceSameMethod if5 = new TwoInterfaceSameMethod();
        if5.sameMethod();
    }
}
