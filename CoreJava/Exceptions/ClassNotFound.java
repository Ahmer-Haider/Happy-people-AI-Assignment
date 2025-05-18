package Assignment.Exceptions;

public class ClassNotFound {

    public static void main(String[] args) {

        try {
            Class.forName("com.exceptions.jala");
            ClassLoader.getSystemClassLoader().loadClass("com.exceptions.jala");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
