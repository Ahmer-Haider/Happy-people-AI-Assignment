package Assignment.Operators;


import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();
        System.out.println("Finding the largest number: ");
        findTheLargestNumber(num1,num2,num3);

    }

    public static void findTheLargestNumber(int n1, int n2, int n3) {
        if(n1>n2 && n1>n3){
            System.out.println(n1+" This is the largest number");
            if(n2>n3){
                System.out.println(n2+" This is the second largest number");
                System.out.println(n3+" This is the smallest number");
            }
            else{
                System.out.println(n3+" This is the second largest number");
                System.out.println(n2+" This is the smallest number");
            }
        }
        else if(n2>n3&&n2>n1){
            System.out.println(n2+" This is the largest number");
            if(n3>n1){
                System.out.println(n3+" This is the second largest number");
                System.out.println(n1+" This is the smallest number");
            }
            else{
                System.out.println(n1+" This is the second largest number");
                System.out.println(n3+" This is the smallest number");
            }
        }
        else{
            System.out.println(n3+" This is the largest number");
            if(n1>n2){
                System.out.println(n1+" This is the second largest number");
                System.out.println(n2+" This is the smallest number");
            }
            else{
                System.out.println(n2+" This is the second largest number");
                System.out.println(n1+" This is the smallest number");
            }
        }
    }
}
