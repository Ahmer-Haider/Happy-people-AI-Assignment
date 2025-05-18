package Assignment.Exceptions;


public class ArithmeticExceptionTryCatch {

    public static void main(String[] args) {
        int a = 10, b = 0, c;

        // 1. Generating Arithmetic Exception without exception handling
        System.out.println("1. Without exception handling:");
        try {
            // This will throw ArithmeticException
            c = a / b;
            System.out.println("c = " + c);
        } catch (ArithmeticException e) {
            // Catch block here just for demonstration - you can comment out this try-catch to see unhandled exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        // 2. Handling Arithmetic exception using try-catch block
        System.out.println("\n2. Handling the exception with try-catch:");
        try {
            c = a / b;
            System.out.println("c = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Handling the Arithmetic exception using try-catch block");
        }

        System.out.println("Program continues...");
    }
}
