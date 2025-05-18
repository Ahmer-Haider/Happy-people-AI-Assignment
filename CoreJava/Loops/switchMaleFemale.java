package Assignment.Loops;

import java.util.Scanner;

public class switchMaleFemale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender M/F: ");
        char gender = sc.next().toUpperCase().charAt(0);
        while(!(gender == 'M'||gender == 'F')){
            System.out.print("Enter gender M/F: ");
            gender = sc.next().toUpperCase().charAt(0);
        }
        switch (gender){
            case 'M':
                System.out.println("Gender is Male");
                break;
            case 'F':
                System.out.println("Gender is Female");
                break;
        }

        sc.close();

    }
}
