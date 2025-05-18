/*
Problem 3: Program to equal operator and not equal operators.
Problem 4: Write a program to print the odd and even numbers.
*/
package Assignment.Loops;

import java.util.Scanner;

public class evenOddNumber {
    public static void evenNumber(int num){
        System.out.println("Even Numbers from 0 to "+num);
        for(int i=0;i<=num;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

    }
    public static void oddNumber(int num){
        System.out.println();
        System.out.println("Odd Numbers from 0 to "+num);
        for(int i=0;i<=num;i++){
            if(!(i%2==0)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        evenNumber(num);
        oddNumber(num);

    }
}
