// Palindrome 10: Write a program to palindrome or not

package Assignment.Loops;

import java.util.Scanner;

public class palindrome {
    public static boolean palindromeNumber(int num){
        int temp=num;
        int sum=0;
        while(num>0){
            int digit = num%10;
            sum = sum*10 + digit;
            num=num/10;
        }
        if(sum == temp){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if Palindrome or not: ");
        int num = sc.nextInt();
        if(palindromeNumber(num)){
            System.out.println(num+" is a Palindrome");
        }
        else{
            System.out.println(num+" is not a Palindrome");
        }
    }

}
