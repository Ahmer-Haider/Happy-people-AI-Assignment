/* 5. Define the local and Global variables with the same name and print both variables and
   understand the scope of the variable
 */

package Assignment.Basics;

class exampleOfLocalAndInstanceVariable{
    int num = 20;
    void localVariableExample(){
        int num = 25;
        System.out.println("Local Variable: "+num);
    }
}

public class localAndGlobalVariable {
    public static void main(String[] args) {
        exampleOfLocalAndInstanceVariable obj = new exampleOfLocalAndInstanceVariable();
        System.out.println("This is Instance Variable: "+obj.num);
        System.out.print("This is Local Variable: ");
        obj.localVariableExample();
    }

}