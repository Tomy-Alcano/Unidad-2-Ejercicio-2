import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{

            JFrame ventana = new JFrame("Sistema de turnos Medicos");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(600,400);
            ventana.setLocationRelativeTo(null);

            ventana.setLayout(new BorderLayout());

            JPanel panelSuperior = new JPanel();

            JLabel titulo = new JLabel("Sistema de turnos Médicos");

            panelSuperior.add(titulo);

            JPanel panelCentral = new JPanel();

            panelCentral.setBackground(Color.LIGHT_GRAY);

            JPanel panelInferior = new JPanel();

            JButton botNuevo = new JButton("Nuevo Turno");

            JButton botVer = new JButton("Ver Turnos");

            JButton botSalir = new JButton("Salir");

            panelInferior.add(botNuevo);
            panelInferior.add(botVer);
            panelInferior.add(botSalir);

            ventana.add(panelSuperior,BorderLayout.NORTH);
            ventana.add(panelCentral,BorderLayout.CENTER);
            ventana.add(panelInferior,BorderLayout.SOUTH);

            ventana.setVisible(true);

        });
    }

}

/*
Al redimensionar la ventana, la zona que se achica es la zona gris
mientras que los bordes de los botones quedan del mismo tamaño
 */