package exemploeventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Evento1  {

    JFrame marco;
    JPanel panel;
    JButton bAzul, bVer, bAma;

    public Evento1() {
        //Utilizando unha clase interna
        marco = new JFrame("Exemplo Eventos");
        panel = new JPanel();
        bAzul = new JButton("Azul");
        bVer = new JButton("Vermello");
        bAma = new JButton("Amarelo");
        PonColor color=new PonColor();
        //caracteristicas:
        marco.setSize(400, 200);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bAzul.addActionListener(color);
        bVer.addActionListener(color);
        bAma.addActionListener(color);

        //añadir
        panel.add(bAzul);
        panel.add(bVer);
        panel.add(bAma);
        marco.add(panel);

        //Facer visible
        marco.setVisible(true);
        marco.pack();
        marco.setLocationRelativeTo(null);

    }
public class PonColor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if (boton == bAzul) {
            panel.setBackground(Color.blue);
        } else if (boton == bVer) {
            panel.setBackground(Color.red);
        } else {
            panel.setBackground(Color.yellow);
        }

    }
}
}


