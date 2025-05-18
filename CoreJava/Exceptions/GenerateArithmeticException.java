package Assignment.Exceptions;

public class GenerateArithmeticException {

    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught!");
            e.printStackTrace();
        }
    }
}
