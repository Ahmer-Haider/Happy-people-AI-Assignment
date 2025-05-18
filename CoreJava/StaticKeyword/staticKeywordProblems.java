/*
* 1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
* methods and a main method.
* 2. Print instance variables in static methods
* 3. Print static variables in Instance methods
* 4. Call instance methods in static methods
* 5. Call static methods in instance methods
* 6. Print all the static, instance variables in main method
* 7. Call static methods and instance methods in main method
*/

package Assignment.StaticKeyword;


class StaticClass {

    // static variable
    static int sv1 = 11;
    static int sv2 = 22;

    int iv1 = 33;
    int iv2 = 44;

    // static Method 1
    static void staticMethod1() {
        StaticClass obj = new StaticClass();
        System.out.println("Instance variables: " + obj.iv1 + ", " + obj.iv2);
    }

    // instance method 1
    void instanceMethod1() {
        System.out.println("Static variables: " + sv1 + ", " + sv2);
    }

    // static Method 2
    static void staticMethod2() {
        StaticClass obj = new StaticClass();
        obj.instanceMethod1();
    }

    // instance method 2
    void instanceMethod2() {
        staticMethod1();
    }
}
public class staticKeywordProblems {

    public static void main(String[] args) {
        StaticClass stc = new StaticClass();

        //Prints all the static, instance variables in main method
        System.out.println("Static variables: " + StaticClass.sv1 + ", " + StaticClass.sv2);
        System.out.println("Instance variables: " + stc.iv1 + ", " + stc.iv2);


        //Calls static methods and instance methods in main method
        //static methods
        StaticClass.staticMethod1();
        StaticClass.staticMethod2();

        //instance methods
        stc.instanceMethod1();
        stc.instanceMethod2();
    }
}

