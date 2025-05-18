
/*
 * 06. Create an interface with a default method and implement it in a class. Do not provide
 * implementation to the default method and call the method.
 */package Assignment.Interfaces;

interface A7 {
    default void defaultMethod() {
        System.out.println("This is a default method");
    }
}


public class InterfaceDefaultMethod implements A7{
    public static void main(String[] args) {
        InterfaceDefaultMethod if6 = new InterfaceDefaultMethod();
        if6.defaultMethod();
    }
}
