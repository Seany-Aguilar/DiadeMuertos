
package CalaveraLiterariaT;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

/**
 *
 * @author BETTERLEE
 */
public class Window extends JFrame {
     
    Imagen panel = new Imagen();
    Imagen boton = new Imagen();
    public Window(){
        
        this.setTitle("Calavera Literaria para Victor");
        this.setSize(new Dimension(950, 600)); 
        this.getAccessibleContext();
        this.setLocationRelativeTo(null);
        this.add(panel, BorderLayout.CENTER);
        //this.add(boton, this);
    }
    
    public static void main(String[] args) {
        Window frame = new Window();
        //Component = frame.boton.add(panel);
        frame.setVisible(true);
        frame.getWindowListeners();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
}
