// Problem 2: Write a function to calculate the average value of an array of integers

package Assignment.Arrays;

import java.util.Scanner;

public class averageOfElements {
    public static int avgOfEleOfArrays(int[] arr){
        int sum=0;
        int len = arr.length;
        for(int ele:arr){
            sum += ele;
        }
        return sum/len;

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
        System.out.print("Average of the array elements: ");
        System.out.println(avgOfEleOfArrays(arr));
    }
}
