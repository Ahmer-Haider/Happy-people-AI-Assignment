/**
 * 01. Write two methods with the same name but different number of parameters of same type
 * and call the methods from main method
 *
 * 02. Write two methods with the same name but different number of parameters of different
 * data type and call the methods from main method
 *
 * 03. Write two methods with the same name and same number of parameters of same type
 * and call from main method
 *
 * 04. Write two methods with the same name and same number of parameters of different
 * type and call from main method
 *
 * 05. Write two methods with the same name, number of parameters and data type but
 * different return Type
 */

package Assignment.MethodOverloading;

public class MethodOverloadingProblems {
    int num1, num2, rollNo;
    String name;

    // 01. same name, different number of parameters (same type)
    void method1(int num1) {
        this.num1 = num1;
        System.out.println("1.First number : " + num1);
    }

    void method1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("1.Sum of two numbers : " + (num1 + num2));
    }

    // 02. same name, different number and type of parameters
    void method2(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("2.Roll number : " + rollNo);
    }

    void method2(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        System.out.println("2.Roll number : " + rollNo + " ; Name : " + name);
    }

    // 04. same name, same number of parameters, different parameter type
    void method4(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("4.Roll number : " + rollNo);
    }

    void method4(String name) {
        this.name = name;
        System.out.println("4.Name : " + name);
    }

    public static void main(String[] args) {
        MethodOverloadingProblems mo = new MethodOverloadingProblems();

        mo.method1(11);
        mo.method1(10, 20);

        mo.method2(25);
        mo.method2(25, "Ahmer");

        mo.method4(25);
        mo.method4("Ahmer");
    }

    /*
    NOTE:
    03. Cannot define two methods with the same name and same number and type of parameters.
    05. Return type alone cannot differentiate overloaded methods; causes compile-time error.
    */
}
