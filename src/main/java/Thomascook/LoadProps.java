package Thomascook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by welcome on 30/12/2016.
 */
public class LoadProps {
    public static String getProperty(String key) {
        Properties prop = new Properties();
        FileInputStream input;

        try {
            input = new FileInputStream("src\\test\\java\\Resources\\Dataconfigfile.properties");
            prop.load(input);
            input.close ();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
