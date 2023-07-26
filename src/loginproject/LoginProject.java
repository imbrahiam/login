package loginproject;

import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LoginProject {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } 
        catch (UnsupportedLookAndFeelException ex) {

        }
        
        HandlerMethods.Home();
       
    }
}
