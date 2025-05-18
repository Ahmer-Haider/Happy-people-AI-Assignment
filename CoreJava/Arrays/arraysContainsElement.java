// Problem 17: Write a method to verify if the array contains two specified elements(12,23)

package Assignment.Arrays;

import java.util.*;

public class arraysContainsElement {
    public static boolean eleContains(int[] arr, int num){
        for(int i : arr){
             if(i==num){
                 return true;
             }
        }
        return false;
    }

    public static int indexOfELeContains(int[] arr, int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
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
        System.out.print("Enter the number to find: ");
        int ele = sc.nextInt();
        if(eleContains(arr,ele)){
            System.out.println(ele+" is present in the array at: "+indexOfELeContains(arr,ele)+" index");
        }
        else{
            System.out.println(ele+" is not present in the array");
        }
    }
}
