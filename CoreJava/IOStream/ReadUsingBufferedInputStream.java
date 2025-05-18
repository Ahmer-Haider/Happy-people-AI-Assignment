package Assignment.IOStream;

/*
 * 3. Read text from a .txt file using BufferedInputStream
 */


import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ReadUsingBufferedInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Hassan\\Desktop\\Assignment\\Assignment CoreJava\\src\\Assignment\\IOStream\\bos.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }

            bis.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
