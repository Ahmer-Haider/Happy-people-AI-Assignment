package Assignment.Exceptions;

class InvalidExamException extends Exception {
    InvalidExamException(String msg) {
        System.out.println(msg);
    }
}

public class CreateOwnException {

    static void exam(int marks) throws InvalidExamException {
        if (marks < 40) {
            throw new InvalidExamException("Failed in exam");
        } else {
            System.out.println("Passed in exam");
        }
    }

    public static void main(String[] args) {
        try {
            exam(39);
        } catch (Exception i) {
            i.printStackTrace();
        }
    }
}
