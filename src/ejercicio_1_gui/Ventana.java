
package ejercicio_1_gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel etiqueta;
    private JButton boton;
    private int contador = 0;
    
    public Ventana(){
        setSize(400, 400);      //Tamaño a la ventana
        setTitle("Ejercicio 1");    //Titulo a la ventana
        setLocationRelativeTo(null);   //Ventana al centro
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarBoton();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null); //Desactivando el diseño del panel
        this.add(panel);
    }    
    
    private void colocarEtiqueta(){
        etiqueta = new JLabel("Pulsa el botón",SwingConstants.CENTER);
        etiqueta.setBounds(0, 50, 400, 40);
        etiqueta.setFont(new Font("Arial",0,20));
        panel.add(etiqueta);
    }
    
    private void colocarBoton(){
        boton = new JButton("Pulsa aqui");
        boton.setBounds(90, 250, 200, 50);
        boton.setFont(new Font("cooper black",0,20));
        panel.add(boton);
        
        eventoOyenteDeAccion();
    }    
    
    private void eventoOyenteDeAccion(){
        ActionListener oyenteDeAccion = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                if (contador == 1) {
                    etiqueta.setText("Has presionado el botón 1 vez");
                }
                else{
                    etiqueta.setText("Has presionado el botón "+contador+" veces");
                }
            }
        };

        boton.addActionListener(oyenteDeAccion);
    }
   
}
