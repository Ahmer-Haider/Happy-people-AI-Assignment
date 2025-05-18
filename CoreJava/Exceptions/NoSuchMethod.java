package Assignment.Exceptions;


import java.lang.reflect.Method;

class Error_14 {
    public void addition(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }
}

public class NoSuchMethod {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.Assignment.Exception.Error_14");
            Method m = c.getDeclaredMethod("subtraction", int.class, int.class);
        } catch (NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
