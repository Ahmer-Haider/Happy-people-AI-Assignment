// Problem 15: Write a method to find number of even number and odd numbers in an array

package Assignment.Arrays;

import java.util.Scanner;

public class evenOddNumberInArray {
    public static void evenNum(int[] arr){
        System.out.print("The even numbers in the array are: ");
        for(int i:arr){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void oddNum(int[] arr){
        System.out.print("\nThe odd numbers in the array are: ");
        for(int i:arr){
            if(!(i%2==0)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the elements in Array: ");
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        evenNum(arr);
        oddNum(arr);
    }
}
