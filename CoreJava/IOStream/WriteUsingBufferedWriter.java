package Assignment.IOStream;

/*
 * 8. Write text to a .txt file using BufferedWriter
 */

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteUsingBufferedWriter {
    public static void main(String[] args) {
        String text = "This text is written using BufferedWriter.";

        try {
            FileWriter fw = new FileWriter("bw.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(text);

            bw.close();
            fw.close();

            System.out.println("Data is written to the file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
