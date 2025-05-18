//Problem 19: Write a function to find the missing number of sorted array of 1 to 100

package Assignment.Arrays;

import java.util.*;

public class missingNumber {
    public static void missingNum(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.print("Missing number of sorted array of 1 to 100 ");
        for(int i=1;i<100;i++){
            if(!(set.contains(i))){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: " );
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the elements in Array: ");
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        missingNum(arr);
    }
}
