package Assignment.Arrays;

import java.util.Scanner;

public class maxMinValue {
    public static int minEle(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
    public static int maxEle(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
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
        System.out.println("The min and max term of the array are ");
        System.out.println("min term = "+minEle(arr)+" and max term = "+maxEle(arr));
    }
}
