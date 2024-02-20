package interfacesgraficasopcionpane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class examenpractico1�trim2324 extends JFrame {

    public examenpractico1�trim2324() {
        // Configuraci�n del JFrame principal el �titulo es "Examen pr�ctico"
        setTitle("Examen pr�ctico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
       setLocation(300,300);

        // Crear los botones en un JPanel con BorderLayout, para ello es mejor usar un array
        JPanel BotonPanel = new JPanel(new BorderLayout());
        String[] nombresBotones = {"Bot�n 1", "Bot�n 2", "Bot�n 3", "Bot�n 4", "Bot�n 5", "Bot�n 6"};

        // Crear panel para los botones del North
        JPanel panelNorte = new JPanel(new FlowLayout());
        for (int i = 0; i < 3; i++) {
            JButton boton = new JButton(nombresBotones[i]);
            configurarBoton(boton);
            boton.addActionListener(new BotonEscucha());
            panelNorte.add(boton);
        }

        // Crear panel para los botones del South
        JPanel panelSur = new JPanel(new FlowLayout());
        for (int i = 3; i < 6; i++) {
            JButton boton = new JButton(nombresBotones[i]);
            configurarBoton(boton);
            boton.addActionListener(new BotonEscucha());
            panelSur.add(boton);
        }

        BotonPanel.add(panelNorte, BorderLayout.NORTH);
        BotonPanel.add(panelSur, BorderLayout.SOUTH);

        add(BotonPanel, BorderLayout.CENTER);

        // Crear men� con opciones para cada bot�n
        JMenuBar menuBar = new JMenuBar();
        JMenu menuBotones = new JMenu("Botones");

        for (String nombre : nombresBotones) {
            JMenuItem menuItem = new JMenuItem(nombre);
            menuItem.addActionListener(new MenuEscucha());
            menuBotones.add(menuItem);
        }

        menuBar.add(menuBotones);
        setJMenuBar(menuBar);
    }

    private void configurarBoton(JButton boton) {
        boton.setBackground(new Color(135, 206, 250)); // Color de fondo
        boton.setForeground(Color.BLACK); // Color del texto
    }
    // ActionListener de los bontones
    private class BotonEscucha implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();

            // Crear la nueva ventana al pulsar el bot�n
            JFrame nuevaVentana = new JFrame("Ventana " + source.getText());
            nuevaVentana.setSize(300, 200);
           // nuevaVentana.setLocationRelativeTo(null);

            // A�adir un JLabel y un bot�n de cerrar a la nueva ventana
            JLabel label = new JLabel("Se ha pulsado " + source.getText());
            JButton cerrarBoton = new JButton("Cerrar");
            cerrarBoton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    nuevaVentana.dispose(); // Cerrar la ventana al pulsar el bot�n de cerrar
                }
            });

            nuevaVentana.setLayout(new BorderLayout());
            nuevaVentana.add(label, BorderLayout.CENTER);
            nuevaVentana.add(cerrarBoton, BorderLayout.SOUTH);

            nuevaVentana.setVisible(true);
        }
    }

    private class MenuEscucha implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem menuItem = (JMenuItem) e.getSource();

            // Crear la nueva ventana al pulsar la opci�n del men�
            JFrame nuevaVentana = new JFrame("Ventana " + menuItem.getText());
            nuevaVentana.setSize(300, 200);
            nuevaVentana.setLocation(300, 300);;

            // A�adir un JLabel y un bot�n de cerrar a la nueva ventana
            JLabel label = new JLabel("Se ha pulsado " + menuItem.getText());
            JButton cerrarBoton = new JButton("Cerrar");
            cerrarBoton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    nuevaVentana.dispose(); // Cerrar la ventana al pulsar el bot�n de cerrar
                }
            });

            nuevaVentana.setLayout(new BorderLayout());
            nuevaVentana.add(label, BorderLayout.CENTER);
            nuevaVentana.add(cerrarBoton, BorderLayout.SOUTH);

            nuevaVentana.setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new examenpractico1�trim2324().setVisible(true);
            }
        });
    }
}

