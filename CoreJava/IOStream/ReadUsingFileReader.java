package Assignment.IOStream;

/**
 * 5. Write a program to read text from a .txt file using FileReader
 * @author K. Sharan Simha Reddy
 */


import java.io.FileReader;

public class ReadUsingFileReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Hassan\\Desktop\\Assignment\\Assignment CoreJava\\src\\Assignment\\IOStream\\fw.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
