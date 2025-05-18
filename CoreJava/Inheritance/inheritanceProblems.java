package Assignment.Inheritance;

// Parent class
class A {
    int n = 11;

    void methodA1() {
        System.out.println("This is Class A Method 1");
    }

    void methodA2() {
        System.out.println("This is Class A Method 2");
    }

    void method3() {
        System.out.println("This is override method - Class A");
    }
}

// B extends A
class B extends A {
    int n = 22;

    void methodB1() {
        System.out.println("This is Class B Method 1");
    }

    void methodB2() {
        System.out.println("This is Class B Method 2");
    }

    @Override
    void method3() {
        System.out.println("This is override method - Class B");
    }
}

// C extends B
class C extends B {
    int n = 33;

    void methodC1() {
        System.out.println("This is Class C Method 1");
    }

    void methodC2() {
        System.out.println("This is Class C Method 2");
    }

    @Override
    void method3() {
        System.out.println("This is override method - Class C");
    }
}
public class inheritanceProblems {
    public static void main(String[] args) {

        // Own objects calling own methods
        A a = new A();
        a.methodA1();
        a.methodA2();
        a.method3();

        B b = new B();
        b.methodB1();
        b.methodB2();
        b.method3();

        C c = new C();
        c.methodC1();
        c.methodC2();
        c.method3();

        // Using superclass reference for subclass objects (method overriding)
        A ref;
        ref = new B();
        ref.method3();  // Calls B's version
        ref = new C();
        ref.method3();  // Calls C's version

        // Runtime polymorphism with variables (not achieved)
        A obj;
        obj = new A();
        System.out.println(obj.n);  // 11
        obj = new B();
        System.out.println(obj.n);  // Still 11
        obj = new C();
        System.out.println(obj.n);  // Still 11

        // Note: Only methods are overridden, variables aren't
    }
}
