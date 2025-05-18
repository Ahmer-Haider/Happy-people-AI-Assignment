package Assignment.Arrays;

/*
 * 5.Write a function to remove a specific element from an array
 */

import java.util.*;

public class RemoveElementFromArray {

    public static int[] removeElement(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        System.out.print("Select an index to remove a value from arr = " + Arrays.toString(arr) + ": ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("Array after removing Element at index " + index);
        arr = removeElement(arr, index);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}

