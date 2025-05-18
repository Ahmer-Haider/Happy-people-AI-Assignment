package Assignment.IOStream;

/**
 * 1. Write a program to read text from a .txt file using InputStream
 * @author K. Sharan Simha Reddy
 */

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadUsingInputStream {
    public static void main(String[] args) {
        try {
            InputStream fis = new FileInputStream("C:\\Users\\Hassan\\Desktop\\Assignment\\Assignment CoreJava\\src\\Assignment\\IOStream\\os.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
