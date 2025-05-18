// Problem 11: Write a program to find the common values between two arrays

package Assignment.Arrays;

import java.util.Scanner;

public class commonValueBtnArrays {
    public static void commonValue(int[] arr1, int[] arr2){
        System.out.print("Common value between the two arrays are: ");
        for(int i:arr1){
            for(int j:arr2){
                if(i==j){
                    System.out.print(i+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of 1st Array: ");
        int len1 = sc.nextInt();
        System.out.print("Enter the length of 2nd Array: ");
        int len2 = sc.nextInt();
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        System.out.print("Enter the elements in 1st Array: ");
        for(int i=0;i<len1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the elements in 2nd Array: ");
        for(int i=0;i<len2;i++){
            arr2[i] = sc.nextInt();
        }
        commonValue(arr1,arr2);

    }
}
