// Problem 8: Write a program to find Armstrong number or not.

package Assignment.Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean amstNumber(int num){
        int temp = num;
        int sum=0;
        int pow = num%10;
        while(num>0){
            int digit = num%10;
            sum += (int) Math.pow(digit,pow);
            num /= 10;
        }

        return temp == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if Armstrong or not: ");
        int num = sc.nextInt();
        if(amstNumber(num)){
            System.out.println(num+" This is an Armstrong Number");
        }
        else{
            System.out.println(num+" This is not an Armstrong Number ");
        }
    }
}
