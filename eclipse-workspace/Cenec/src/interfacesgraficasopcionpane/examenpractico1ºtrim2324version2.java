package interfacesgraficasopcionpane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class examenpractico1�trim2324version2 extends JFrame {

    public examenpractico1�trim2324version2() {
        // Configuraci�n del JFrame principal
        setTitle("Examen pr�ctico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(300, 300);

        // Crear un panel principal con BorderLayout
        JPanel BotonPanel = new JPanel(new BorderLayout());
        String[] nombresBotones = {"Bot�n 1", "Bot�n 2", "Bot�n 3", "Bot�n 4", "Bot�n 5", "Bot�n 6"};

        // Crear panel para los botones del Norte
        JPanel panelNorte = new JPanel(new FlowLayout());
        JPanel panelSur = new JPanel(new FlowLayout());
     

        for (int i = 0; i < 6; i++) {
            JButton boton = new JButton(nombresBotones[i]);
            configurarBoton(boton);
            boton.addActionListener(e -> procesarBoton(e));

            if (i < 3) {
                // Agregar los primeros tres botones al panelNorte
                panelNorte.add(boton);
            } else {
                // Agregar los siguientes tres botones al panelSur
                panelSur.add(boton);
            }
        }

        BotonPanel.add(panelNorte, BorderLayout.NORTH);
        BotonPanel.add(panelSur, BorderLayout.SOUTH);


        // Agregar paneles Norte y Sur al panel principal
        BotonPanel.add(panelNorte, BorderLayout.NORTH);
        BotonPanel.add(panelSur, BorderLayout.SOUTH);

        // Agregar el panel principal al centro del JFrame
        add(BotonPanel, BorderLayout.CENTER);

        // Crear la barra de men�
        JMenuBar menuBar = new JMenuBar();
        JMenu menuBotones = new JMenu("Botones");

        // Crear elementos de men� para cada bot�n
        for (String nombre : nombresBotones) {
            JMenuItem menuItem = new JMenuItem(nombre);
            // Agregar un ActionListener directamente para manejar clics en los elementos del men�
            menuItem.addActionListener((ActionEvent e) -> {
                // Crear la nueva ventana al pulsar la opci�n del men�
                JFrame nuevaVentana = new JFrame("Ventana " + nombre);
                nuevaVentana.setSize(300, 200);
                nuevaVentana.setLocation(300, 300);

                JLabel label = new JLabel("Se ha pulsado " + nombre);
                JButton cerrarBoton = new JButton("Cerrar");
                cerrarBoton.addActionListener(e2 -> nuevaVentana.dispose());

                nuevaVentana.setLayout(new BorderLayout());
                nuevaVentana.add(label, BorderLayout.CENTER);
                nuevaVentana.add(cerrarBoton, BorderLayout.SOUTH);

                nuevaVentana.setVisible(true);
            });
            // Agregar el elemento del men� al men�
            menuBotones.add(menuItem);
        }

        // Agregar el men� a la barra de men�
        menuBar.add(menuBotones);
        // Establecer la barra de men� en el JFrame
        setJMenuBar(menuBar);
    }

    // M�todo para configurar la apariencia de los botones
    private void configurarBoton(JButton boton) {
        boton.setBackground(new Color(135, 206, 250));
        boton.setForeground(Color.BLACK);
    }

    // M�todo para manejar acciones de los botones
    private void procesarBoton(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        JFrame nuevaVentana = new JFrame("Ventana " + source.getText());
        nuevaVentana.setSize(300, 200);

        JLabel label = new JLabel("Se ha pulsado " + source.getText());
        JButton cerrarBoton = new JButton("Cerrar");
        cerrarBoton.addActionListener(e2 -> nuevaVentana.dispose());

        nuevaVentana.setLayout(new BorderLayout());
        nuevaVentana.add(label, BorderLayout.CENTER);
        nuevaVentana.add(cerrarBoton, BorderLayout.SOUTH);
        nuevaVentana.setLocation(300, 300);
        nuevaVentana.setVisible(true);
    }

    public static void main(String[] args) {
        // Iniciar la aplicaci�n Swing en el hilo de despacho de eventos
    	SwingUtilities.invokeLater(new Runnable() {
    	    @Override
    	    public void run() {
    	        new examenpractico1�trim2324version2().setVisible(true);
    	    }
    	});

    }
}
