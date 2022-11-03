
package Fantasma;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

/*@author BETTERLEE
 */
public class Cambio extends Thread{
    private Graphics g;
    private String cadena;
    private Random r;
    private Principal f;
    private int i,paso;
    
    public Cambio(Graphics g,String cadena,Principal f)
    {
        this.g = g;
        this.cadena = cadena;
        r = new Random();
        this.f = f;
        this.i = 0;
        this.paso = 0;
    }

    @Override
    public void run()
    {
        while(true)
        {
            try{
                sleep(1000);
                g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
                g.fillOval((f.getWidth()/2) -75 , 100,150,150);
                g.fillRect((f.getWidth()/2)-75, 175, 150, 200);

                while(i < 6)
                {
                    g.fillOval((f.getWidth()/2)-75 + paso, 362 , 25, 25);
                    i++;
                    paso += 25;
                }
                i = 0;
                paso =0;
                g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
                g.fillOval((f.getWidth()/2)-50, 150, 40, 40);
                g.fillOval((f.getWidth()/2)+10, 150, 40, 40);
                g.fillOval((f.getWidth()/2)-20, 200, 40, 60);

                Font ff = new Font("Chiller",Font.CENTER_BASELINE,30);
                g.setFont(ff);
                g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
                g.drawString(cadena,f.getWidth()/2-70,440);
            }
            catch(Exception ex)
            {
                
            }
        }
}
}
