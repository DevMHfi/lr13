package localization;

import java.util.Locale;
import java.util.ResourceBundle;
public class Localization {
    public void printMes(Locale locale)
    {
        ResourceBundle message = ResourceBundle.getBundle("task1", locale);
        for (String key : message.keySet()){
            System.out.print(key + ": " + message.getString(key) + "\n");
        }
    }
}
