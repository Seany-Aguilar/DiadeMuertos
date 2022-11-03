package CalaveraLiterariaT;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author BETTERLEE
 */
public class Imagen extends JPanel {
 
    @Override
    public void paint(Graphics g) {
        Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Pantano.jpg"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintChildren(g);
    }
    public Imagen(){
        JPanel panel = new JPanel();
        JButton boton = new JButton("Open Pdf");
        boton.setBounds(500, 500, 90, 40);
        boton.setForeground(Color.WHITE);
        boton.setContentAreaFilled(false);
        
        ActionListener openUrl = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String direccion = "https://drive.google.com/file/d/1-a4pi4xvDlKht35mfzel2LbWrpmLJXPt/view";
                try{ 
                    Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler" + "https://drive.google.com/file/d/1-a4pi4xvDlKht35mfzel2LbWrpmLJXPt/view");
                    boton.addActionListener(this);
                }catch(IOException ActionEvent){
                 ActionEvent.printStackTrace();
                 JOptionPane.showMessageDialog(null, "Check file details");
            }
        };
            
    };
     panel.add(boton);
     boton.getAccessibleContext();
     boton.addActionListener(openUrl);
     //panel.addActionListener(openUrl);
     panel.setVisible(true);
}
}

