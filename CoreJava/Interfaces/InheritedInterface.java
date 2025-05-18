package Assignment.Interfaces;

interface A8{
    void methodOne();
}
interface B extends A8{
    void methodTwo();
}
public class InheritedInterface implements B{
    @Override
    public void methodOne() {
        System.out.println("Executing first method");
    }

    @Override
    public void methodTwo() {
        System.out.println("Executing second method");
    }

    public static void main(String[] args) {
        InheritedInterface instance = new InheritedInterface();
        instance.methodOne();
        instance.methodTwo();
    }
}
