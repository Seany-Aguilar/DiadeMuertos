
package Fantasma;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

/* @author BETTERLEE
 */
public class Principal  extends JFrame{

   private int i,paso;
    String texto = "De:Seany\n " + "Para:Victor \n";
    String texto2= "\n\n¡Feliz dia de Muertos!";
    
    public Principal(){
        setLocation(100,150);
        setSize(500,500);
        getContentPane().setBackground(Color.black);
        setVisible(true);
        paso = 0; 
        i = 0;
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.fillOval((getWidth()/2) -75 , 100,150,150);
        g.fillRect((getWidth()/2)-75, 175, 150, 200);
        
        while(i < 6)
        {
            g.fillOval((getWidth()/2)-75 + paso, 362 , 25, 25);
            i++;
            paso += 25;
        }
        
        g.setColor(Color.BLACK);
        g.fillOval((getWidth()/2)-50, 150, 40, 40);
        g.fillOval((getWidth()/2)+10, 150, 40, 40);
        g.fillOval((getWidth()/2)-20, 200, 40, 60);
        
        Font f = new Font("Chiller",Font.BOLD,40);
        g.setFont(f);
        g.setColor(Color.getHSBColor(132.1F, 78.2F, 3.3F));
        g.drawString(texto,this.getWidth()/70,440);
        g.drawString(texto2,this.getWidth()/2-70,480);
        
    }
    public void ActionBoton2(){
        
    }
    public static void main(String[] args) {
        Principal f = new Principal();
        Cambio c = new Cambio(f.getGraphics(), "Feliz dia de muertos", f);
        //c.start();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
