package Assignment.IOStream;

/*
 * 4. Write text to a .txt file using BufferedOutputStream
 */


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class WriteUsingBufferedOutputStream {

    public static void main(String[] args) {
        String text = "This text is written using BufferedOutputStream.";

        try {
            FileOutputStream fos = new FileOutputStream("bos.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            bos.write(text.getBytes());

            bos.close();
            fos.close();

            System.out.println("Data is written to the file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
