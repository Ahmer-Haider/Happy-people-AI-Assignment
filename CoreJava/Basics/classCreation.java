// Problem 1: How to create a class, object, method and its signature.


        package Assignment.Basics;


class creatingClass{
    public void method1(){
        System.out.println("This is Method 1");
    }
    public void method2(int a){
        System.out.println("This is method 2 with parameter: "+a);
    }
}
public class classCreation {
    public static void main(String[] args) {
        creatingClass obj = new creatingClass();
        obj.method1();
        obj.method2(5);
    }
}
