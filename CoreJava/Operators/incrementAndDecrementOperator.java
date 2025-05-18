// Problem 2: Write a method for increment and decrement operators(++, --)

package Assignment.Operators;

class incAndDecOperators{
    public void preInc(int a, int b){
        int preIncrement = a + (++b);
        System.out.println("This is value after pre-Increment: "+ preIncrement);
    }
    public void postInc(int a, int b){
        int postIncrement = a + (b++);
        System.out.println("This is value after post-Increment: "+ postIncrement);
    }
    public void preDec(int a, int b){
        int preDecrement = a + (--b);
        System.out.println("This is value after pre-Decrement: "+ preDecrement);
    }
    public void postDec(int a, int b){
        int postDecrement = a + (b++);
        System.out.println("This is value after post-Decrement: "+ postDecrement);
    }
}

public class incrementAndDecrementOperator {
    public static void main(String[] args) {
        incAndDecOperators obj = new incAndDecOperators();
        obj.postInc(5,4);
        obj.preInc(5,4);
        obj.preDec(5,4);
        obj.postDec(5,4);
    }
}
