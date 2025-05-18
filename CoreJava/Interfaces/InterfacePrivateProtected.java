/*
 * 09. Create a PRIVATE or PROTECTED interface and print the values as above scenario
 * 10. Create an interface with private, public and protected fields
 * 11.  Create an interface with static final variable
 */
package Assignment.Interfaces;

public class InterfacePrivateProtected implements PublicInterfaceFields {
    public static void main(String[] args) {
        InterfacePrivateProtected obj = new InterfacePrivateProtected();
        System.out.println(obj.VALUE_ONE + " " + VALUE_TWO + " " + VALUE_THREE);
    }
}


interface PublicInterfaceFields {
    int VALUE_ONE = 11;
    static final int VALUE_TWO = 22;
    final int VALUE_THREE = 33;
}

