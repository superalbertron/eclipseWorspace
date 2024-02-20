package com.pblazquez.examen.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal2 extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem mi1, mi2, mi3, mi4, mi5, mi6;

    public Principal2() {
        setTitle("Examen pr�ctico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 300);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menu = new JMenu("Botones");
        menuBar.add(menu);

        mi1 = new JMenuItem("Bot�n 1");
        mi1.addActionListener(this);
        menu.add(mi1);

        mi2 = new JMenuItem("Bot�n 2");
        mi2.addActionListener(this);
        menu.add(mi2);

        mi3 = new JMenuItem("Bot�n 3");
        mi3.addActionListener(this);
        menu.add(mi3);

        mi4 = new JMenuItem("Bot�n 4");
        mi4.addActionListener(this);
        menu.add(mi4);

        mi5 = new JMenuItem("Bot�n 5");
        mi5.addActionListener(this);
        menu.add(mi5);

        mi6 = new JMenuItem("Bot�n 6");
        mi6.addActionListener(this);
        menu.add(mi6);

        JPanel botonPanel = new JPanel();
        JPanel panelNorte = new JPanel();
        JPanel panelSur = new JPanel();

        for (int i = 1; i <= 6; i++) {
            JButton boton = new JButton("Boton " + i);
            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JFrame ventanaNueva = new JFrame("Ventana Bot�n");
                    ventanaNueva.setSize(200, 200);
                    ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    ventanaNueva.add(new JLabel("Se ha pulsado " + boton.getText()));
                    ventanaNueva.setVisible(true);
                }
            });
            if (i <= 3) {
                panelNorte.add(boton);
            } else {
                panelSur.add(boton);
            }
        }

        setLayout(new BorderLayout());
        add(panelNorte, BorderLayout.NORTH);
        add(panelSur, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Principal2();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mi1) {
            JOptionPane.showMessageDialog(this, "Seleccionaste el bot�n 1");
        } else if (e.getSource() == mi2) {
            JOptionPane.showMessageDialog(this, "Seleccionaste el bot�n 2");
        } else if (e.getSource() == mi3) {
            JOptionPane.showMessageDialog(this, "Seleccionaste el bot�n 3");
        } else if (e.getSource() == mi4) {
            JOptionPane.showMessageDialog(this, "Seleccionaste el bot�n 4");
        } else if (e.getSource() == mi5) {
            JOptionPane.showMessageDialog(this, "Seleccionaste el bot�n 5");
        } else if (e.getSource() == mi6) {
            JOptionPane.showMessageDialog(this, "Seleccionaste el bot�n 6");
        }
    }
}
