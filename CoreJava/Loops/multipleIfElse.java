//Problem 13: Program for multiple if else statement(The Largest number in 10,20 and 30)

package Assignment.Loops;

import java.util.Scanner;

public class multipleIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2=sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int n3=sc.nextInt();
        if(n1 > n2 && n1 > n3){
            System.out.println(n1+" is the largest");
        }
        else if(n2 > n3 && n2 > n1){
            System.out.println(n2+" is the largest");
        }
        else{
            System.out.println(n3+" is the largest");
        }

        sc.close();
    }
}
