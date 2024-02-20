package componentesbasicos;

import javax.swing.*;
import java.awt.*;

public class Ejercicio6TextArea extends JFrame {
    public Ejercicio6TextArea() {
        setTitle("Formulario Básico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2)); // 4 filas, 2 columnas
    
        JLabel labelComentario = new JLabel("Comentario:");
        JTextArea textAreaComentario = new JTextArea();
        textAreaComentario.setLineWrap(true);
        textAreaComentario.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textAreaComentario);
        add(labelComentario);
        add(scrollPane);

        JButton botonEnviar = new JButton("Enviar");
        botonEnviar.addActionListener(e -> {
            // Puedes agregar aquí la lógica para procesar la información del formulario
            String comentario = textAreaComentario.getText();

            // Ejemplo de imprimir la información en consola
           
            System.out.println("Comentario: " + comentario);
        });
        add(botonEnviar);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio6TextArea().setVisible(true);
        });
    }
}

