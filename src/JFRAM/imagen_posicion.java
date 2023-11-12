package JFRAM;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;

public class imagen_posicion {
    
    public void escaralarLabel(JLabel label, String ruta_imagen ){
        
        label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ruta_imagen)).getImage()
        .getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_DEFAULT)));
    
    }
    
}