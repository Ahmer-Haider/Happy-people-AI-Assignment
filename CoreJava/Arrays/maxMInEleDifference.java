// Problem 16: Write a function to get the difference of largest and smallest value

package Assignment.Arrays;

import java.util.Scanner;

public class maxMInEleDifference {
    public static int differenceBtnMaxMinEle(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min){
                min=i;
            }
            else if(i>max){
                max=i;
            }
        }
        return max-min;
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
        System.out.println("The difference between max and min elements are: "+differenceBtnMaxMinEle(arr));
    }
}
