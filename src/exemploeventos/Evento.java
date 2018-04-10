package exemploeventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Evento implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton bAzul, bVer, bAma;

    public Evento() {
        marco = new JFrame("Exemplo Eventos");
        panel = new JPanel();
        bAzul = new JButton("Azul");
        bVer = new JButton("Vermello");
        bAma = new JButton("Amarelo");

        //caracteristicas:
        marco.setSize(400, 200);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bAzul.addActionListener(this);
        bVer.addActionListener(this);
        bAma.addActionListener(this);

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
