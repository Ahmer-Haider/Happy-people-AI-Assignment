package Assignment.Loops;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if Prime or not: ");
        int num = sc.nextInt();
        if(primeNos(num)){
            System.out.println(num+" is a Prime Number");
        }
        else{
            System.out.println(num+" is not a Prime Number");
        }
    }

    public static boolean primeNos(int num) {
        if(num==1 || num<=0){
            return false;
        }
        for(int i=2;i<=(int) Math.sqrt(num); i++){
            if(num%i==0){
               return false;
            }
        }
        return true;
    }

}
