package Assignment.IOStream;
/*
 * 9. Write a program to read data from properties file
 * @author K. Sharan Simha Reddy
 */


import java.io.FileInputStream;
import java.util.Properties;

public class ReadUsingPropertiesFile {

    public static void main(String[] args) {
        Properties prop = readPropertiesFile("C:\\Users\\Hassan\\Desktop\\Assignment\\Assignment CoreJava\\src\\Assignment\\IOStream\\pf.txt" +
                "");
        System.out.println("Name: " + prop.getProperty("Name"));
        System.out.println("E.no: " + prop.getProperty("E.no"));
        System.out.println("College: " + prop.getProperty("College"));
    }

    public static Properties readPropertiesFile(String fileName) {
        Properties prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(fileName);
            prop.load(fis);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }
}
