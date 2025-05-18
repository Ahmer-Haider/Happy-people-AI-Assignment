// Problem 3: Write a program to find the index of an array element.

package Assignment.Arrays;

import java.util.Scanner;

public class indexOfArray {
    public static int indexOfEle(int[] arr,int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ele){
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
        System.out.print("Enter the number to find the index of: ");
        int ele = sc.nextInt();
        if(indexOfEle(arr,ele)!=-1){
            System.out.println(indexOfEle(arr,ele)+" is the index of the element "+ele);
        }
        else{
            System.out.println("No element found in the array");
        }
    }
}
