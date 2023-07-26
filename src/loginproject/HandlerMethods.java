package loginproject;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;

public abstract class HandlerMethods {
    
    public static JFrame Home() {
        Login iFrame = Login.Singleton();
        DefaultSetting(iFrame);
        return iFrame;
    }
    
    public static JFrame SignUp() {
        
        Register iFrame = Register.Instanciate(false);
        DefaultSetting(iFrame);
        return iFrame;
    }
    
    public static JFrame SignUpFromManagement() {
        
        Register iFrame = Register.Instanciate(true);
        DefaultSetting(iFrame);
        return iFrame;
    }
    
    public static JFrame Management() {
        
        Management iFrame = Management.Singleton();
        DefaultSetting(iFrame);
        return iFrame;
    }
    
     public static JFrame Update(Usuario user) {
        
        Update iFrame = Update.Instanciate(user);
        DefaultSetting(iFrame);
        return iFrame;
    }
    
    private static void DefaultSetting(JFrame iFrame){
        iFrame.setResizable(false);
        /*ImageIcon img = new ImageIcon("./src/Icon/icon.jpg");
        iFrame.setIconImage(img.getImage());*/
        iFrame.setVisible(true);
        iFrame.setTitle("");
        iFrame.pack();
        iFrame.setLocationRelativeTo(null);
    }
}
