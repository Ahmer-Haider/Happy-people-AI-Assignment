/*
Problem 3: Program to equal operator and not equal operators
Problem 4: Write a program to find the two numbers equal or not.
 */


package Assignment.Operators;

import java.util.*;


public class equalAndNotEqualOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        equalityCheck(num1,num2);
        sc.close();

    }
    public static void equalityCheck(int n1, int n2){
        if(n1==n2){
            System.out.println("The numbers are equal: "+n1+" == "+n2);
        }
        else{
            System.out.println("The numbers are different: "+n1+" != "+n2);
        }
    }
}
