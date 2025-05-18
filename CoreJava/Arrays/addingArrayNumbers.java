// Problem 1: Write a function to add integer values of an array

package Assignment.Arrays;

import java.util.Scanner;

public class addingArrayNumbers {
    public static int sumOfArrayElements(int[] arr){
        int sum=0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
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
        System.out.print("Sum of the array elements: ");
        System.out.println(sumOfArrayElements(arr));

    }

}
