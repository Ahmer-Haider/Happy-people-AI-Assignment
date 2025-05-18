// Problem 6: Write a program to print even number between 10 and 100 using while

package Assignment.Loops;

public class evenNoWithWhile {
    public static void main(String[] args) {

        int i = 10;
        int end = 100;
        System.out.println("Even Numbers between 10 and 100 are: ");
        while(i<=end){
            if(i%2==0){
                System.out.print(i + " ");
            }
            i++;
        }
    }

}
