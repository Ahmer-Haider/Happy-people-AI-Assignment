// Problem 6: Program for relational operators (<,<=, >, >=)

package Assignment.Operators;

import java.util.Scanner;

public class relationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Relational Operators: <, >, >=, <= ");
        System.out.print("Greater than (>) operator: Return true or false based on the logic");
        System.out.println(num1>num2);
        System.out.print("Less than (>) operator: Return true or false based on the logic");
        System.out.println(num1<num2);
        System.out.print("Greater than equal to (>=) operator: Return true or false based on the logic");
        System.out.println(num1>=num2);
        System.out.print("less than equal to (<=) operator: Return true or false based on the logic");
        System.out.println(num1<=num2);


        sc.close();
    }
}
