package Assignment.IOStream;

/*
 * 10. Write a program to write data to properties file
 */


import java.io.FileOutputStream;
import java.util.Properties;

public class WriteUsingPropertiesFile {
    public static void main(String[] args) {

        try {
            Properties props = new Properties();
            props.put("Name", "Ahmer Haider");
            props.put("E.no", "025");
            props.put("College", "MJCET Tech");

            FileOutputStream out = new FileOutputStream("pf.txt");
            props.store(out, "Sample properties file");
            out.close();

            System.out.println("Properties file created.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
