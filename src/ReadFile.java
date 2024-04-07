import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ReadFile {
    private static Properties prop = new Properties();

    static {
        System.out.println("calling PropLoader setProperties...");
        setProperties();
    }

    public static void setProperties() {
        // load Properties prop from a file
        try {
            // getClass()
            //prop.load(AppProperties.class.getClassLoader().getResourceAsStream("app.properties"));
            prop.load(new FileInputStream(new File("C:/temp/app.properties")));

        } catch (IOException e) {
            System.out.println("IOException :: " + e);
        }

        System.out.println("Properties set sucessfully...");

    }

    public static String getProperties(String key) {
        return prop.getProperty(key);
    }

    public static void main(String[] args) {

        System.out.println(ReadFile.getProperties("fname"));
        System.out.println(ReadFile.getProperties("lname"));
    }
}
