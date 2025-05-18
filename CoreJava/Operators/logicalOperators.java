//Problem 5: Programs on Logical AND,OR operator and Logical NOT

package Assignment.Operators;

import java.util.Scanner;

public class logicalOperators {
    public static void andLgOperator(int n1, int n2, int n3){
        System.out.println(n1>n2 && n1>n3);
        System.out.println(n1<n2 && n1<n3 );
        System.out.println(n1>n2 && n1<n3);
    }
    public static void orLgOperator(int n1, int n2, int n3){
        System.out.println(n1>n2 || n1>n3);
        System.out.println(n1<n2 || n1<n3 );
        System.out.println(n1>n2 || n1<n3);
    }
    public static void notLgOperator(int n1, int n2, int n3){
        System.out.println(n1!=n2);
        System.out.println(!(n1>n3) );
        System.out.println(!(n1>n2));
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        System.out.println("And Logical Operator: ");
        andLgOperator(num1,num2,num3);
        System.out.println("Or Logical Operator: ");
        orLgOperator(num1,num2,num3);
        System.out.println("Not Logical Operator: ");
        notLgOperator(num1,num2,num3);
    }
}
