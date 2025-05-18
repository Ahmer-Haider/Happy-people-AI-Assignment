package Assignment.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class insertElement {
    public static void insertElementAtPosition(int[] arr, int pos, int ele){
        if(pos<=arr.length){
            for(int i = arr.length;i<=pos;i--){
                arr[i] = arr[i-1];
            }
            arr[pos] = ele;
        }
        else{
            System.out.println("Position out of the length of array ");
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
        System.out.print("Enter the position to insert the element that is less than array length "+len+": ");
        int pos = sc.nextInt();
        System.out.print("Enter the number to insert: ");
        int ele = sc.nextInt();
        insertElementAtPosition(arr,pos,ele);
        System.out.println("The new array after insertion is: "+ Arrays.toString(arr));
    }
}
