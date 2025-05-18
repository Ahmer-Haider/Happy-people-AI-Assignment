/*
 Problem 1. Create an interface with only one method and implement it in a class. Call the method
implemented.*/
package Assignment.Interfaces;

interface A1{
    void oneMethod();
}

public class InterfaceOneMethod implements A1 {
    @Override
    public void oneMethod() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        InterfaceOneMethod instance = new InterfaceOneMethod();
        instance.oneMethod();
    }
}

