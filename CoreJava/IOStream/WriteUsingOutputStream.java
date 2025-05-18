/**
 * 2. Write a program to write text to a .txt file using OutputStream
 */
package Assignment.IOStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteUsingOutputStream {
    public static void main(String[] args) {
        String data = "This text is written using OutputStream.";

        try {
            OutputStream fos = new FileOutputStream("os.txt");
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Data is written to the file.");
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
