
package Imagenes;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/* @author BETTERLEE
 */
public class Imagen  extends JPanel{
    public Imagen(){
        setSize(900,600);
    }
    @Override   
    public void paintComponent(Graphics g){
        Dimension tam = getSize();
        ImageIcon fondo = new ImageIcon(getClass().getResource("Pantano.jpg"));
        g.drawImage(fondo.getImage(), 0, 0, tam.width, tam.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }

}
