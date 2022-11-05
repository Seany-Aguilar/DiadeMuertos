
package CalaveraLiterariaT;

import Fantasma.Principal;
import Imagenes.Imagen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author BETTERLEE
 */
public class Window extends JFrame {
     
     Imagen panel = new Imagen(); 

    public Window(){
        setTitle("Calavera Literaria para Victor");
        setSize(900, 600); 
        getAccessibleContext();
        Componentes();
        add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        //this.add(boton, this);
    }
    public void Componentes(){

        JButton boton = new JButton("Open Pdf");
        boton.setBounds(500, 500, 150, 40);
        boton.setForeground(Color.WHITE);
        boton.setContentAreaFilled(false);
        boton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                Jbutton abrir= new Jbutton();
                abrir.ActionBoton();
            }
        });
        
        add(boton);
        JButton boton2 = new JButton("Fantasma");
        boton2.setBounds(300, 500, 150, 40);
        boton2.setForeground(Color.white);
        boton2.setContentAreaFilled(false);
        boton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Principal f = new Principal();
                f.ActionBoton2();
            }
        });
        boton2.setVisible(true);
        add(boton2);
    }
    
    public static void main(String[] args) {
        Window frame = new Window();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
}
