// Problem 5: Write a program to print largest number among three numbers.

package Assignment.Loops;

import java.util.*;

public class largestAmong3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1+" is the largest");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2+" is the largest");
        }
        else{
            System.out.println(num3+" is the largest");
        }


        sc.close();
    }



}
