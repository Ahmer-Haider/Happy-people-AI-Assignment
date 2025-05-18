package Assignment.ThisAndSuperKeyword;

public class CallUsingThis {
    int number;
    String text;

    CallUsingThis() {
        this(11, "Ahmer");
    }

    CallUsingThis(int number, String text) {
        this.number = number;
        this.text = text;
        System.out.println(number + " " + text);
    }

    public static void main(String[] args) {
        CallUsingThis obj1 = new CallUsingThis();
        CallUsingThis obj2 = new CallUsingThis(12, "Jala");
    }
}
