/**
 * 6. Write a program to write text to a .txt file using FileWriter
 */
package Assignment.IOStream;

import java.io.FileWriter;

public class WriteUsingFileWriter {
    public static void main(String[] args) {
        String text = "This text is written using FileWriter.";

        try {
            FileWriter writer = new FileWriter("fw.txt");
            writer.write(text);
            writer.close();
            System.out.println("Data is written to the file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
