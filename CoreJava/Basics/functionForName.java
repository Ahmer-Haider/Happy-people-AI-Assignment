// 6. Write a function to print your name and call the function from main method.

package Assignment.Basics;

public class functionForName {
    public static void myName(){
        String fullName = "Ahmer Haider";
        System.out.println("My Name is: "+fullName);
    }

    public static void main(String[] args) {
        System.out.println("This is the function call for myName");
        myName();
    }
}
