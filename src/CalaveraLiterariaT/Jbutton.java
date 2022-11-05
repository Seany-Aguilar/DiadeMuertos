
package CalaveraLiterariaT;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* @author BETTERLEE
 */
class Jbutton extends JPanel {
    public Jbutton(){    
    }
    
     public void ActionBoton(){
        String direccion = "https://drive.google.com/file/d/1-a4pi4xvDlKht35mfzel2LbWrpmLJXPt/view";
         try{
            Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/1-a4pi4xvDlKht35mfzel2LbWrpmLJXPt/view"));
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler" + "https://drive.google.com/file/d/1-a4pi4xvDlKht35mfzel2LbWrpmLJXPt/view");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Check file details");  
        }

    }
}
