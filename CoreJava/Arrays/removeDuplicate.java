/*
Problem 12: Write a method to remove duplicate elements from an array
Problem 18: Write a program to remove the duplicate elements and return the new array

 */
package Assignment.Arrays;

import java.util.*;

public class removeDuplicate {
    public static int[] removeDuplicateEle(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int[] newArr = new int[set.size()];
        int idx=0;
        for(int ele:set){
            newArr[idx++]=ele;
        }

        return newArr;
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
        System.out.println("The array after removal duplicate elements "+Arrays.toString(removeDuplicateEle(arr)));
    }

}
