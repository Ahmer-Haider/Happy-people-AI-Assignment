package Assignment.IOStream;

/**
 * 7. Read text from a .txt file using BufferedReader
 */


import java.io.BufferedReader;
import java.io.FileReader;

public class ReadUsingBufferedReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Hassan\\Desktop\\Assignment\\Assignment CoreJava\\src\\Assignment\\IOStream\\bw.txt");
            BufferedReader br = new BufferedReader(fr);

            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }

            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
