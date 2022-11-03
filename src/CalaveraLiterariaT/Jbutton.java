
package CalaveraLiterariaT;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* @author BETTERLEE
 */
class Jbutton extends JPanel {
     public void jbuttonactionPerformed(java.awt.event.ActionEvent evt) {
        try {
            File files = new File("C:\\NeatBeansProject\\¡Feliz día de.pdf");
            if (files.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(files);
                } else {
                    JOptionPane.showMessageDialog(this, "No suported");
                }
            } else {
                JOptionPane.showMessageDialog(this, "File not Exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
