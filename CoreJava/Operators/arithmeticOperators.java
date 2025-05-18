// Problem 1: Write a function for arithmetic operators(+,-,*,/).

package Assignment.Operators;

class arOperators{
    public int addition(int n1, int n2){
        return n1+n2;
    }
    public int subtraction(int n1, int n2){
        return n1-n2;
    }
    public int multiplication(int n1, int n2){
        return n1*n2;
    }
    public double division(int n1, int n2){
        if(n2!= 0){
            return n1/n2;
        }
        return -1;
    }
}
public class arithmeticOperators {
    public static void main(String[] args) {
        arOperators obj = new arOperators();
        System.out.println("This are arithmetic operators ");
        System.out.println("Addition (5 + 10): "+obj.addition(5,10));
        System.out.println("Subtraction (25 - 20): "+obj.subtraction(25,20));
        System.out.println("Multiplication (5 x 10): "+obj.multiplication(5,10));
        System.out.println("Division (10 / 2): "+obj.division(10,2));
    }
}
