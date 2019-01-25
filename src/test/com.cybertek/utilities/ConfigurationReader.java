package utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;
    static {
        //this is the path to the location of the file
        String path = "configuration.properties";

        try {
            //java cannot read files directly, it needs inputstream to read files
            //inputstream takes the location of the file in a constructor
            FileInputStream fileInputStream = new FileInputStream(path);

            //properties files used tp read specifically properties files, files with key value pairs
            properties = new Properties();
            //file contents are loas to properties from the input stream
            properties.load(fileInputStream);
            //all input streams must be closed
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty (String property){
        return properties.getProperty(property);
    }

}