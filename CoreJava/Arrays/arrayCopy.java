// Problem 6: Write a function to copy an array to another array
package Assignment.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the elements in Array: ");
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        int[] copyArr = arr.clone();
        // clone() does shallow copy i.e. change in the copyArr with not affect the arr array
        System.out.println("The copy of the array "+ Arrays.toString(arr)+" is "+Arrays.toString(copyArr));
    }
}
