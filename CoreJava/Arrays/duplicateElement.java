// Problem 10: Write a function to find the duplicate values of an array

package Assignment.Arrays;

import java.util.*;

public class duplicateElement {
    public static void duplicateEle(int[] arr){
        boolean noDup = false;
        Map<Integer,Integer> map = new HashMap<>();

        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        System.out.print("The duplicate elements is/are: ");
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
                noDup = true;
            }
        }

        if(!noDup){
            System.out.println("No duplicate elements");
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
        duplicateEle(arr);
    }
}
