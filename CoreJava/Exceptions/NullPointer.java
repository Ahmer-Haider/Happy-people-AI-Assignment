package Assignment.Exceptions;

/*
 *
 * 15. Write a program to generate NullPointerException
 */


public class NullPointer {

    static void simpleNullCheck(String str) {
        System.out.println(str.length());
    }

    public static void main(String args[]) {
        String input = null;
        try {
            simpleNullCheck(input);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            e.printStackTrace();
        }
    }
}
