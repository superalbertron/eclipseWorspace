package examen1ºtrimestre;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

// Panel para obtener la información de nuestro usuario interesado en el FP
public class Principal extends JFrame {
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldEdad;
	private JTextArea textAreaComentarios;
	private JCheckBox checkBoxJava;
	private JCheckBox checkBoxPython;
	private JRadioButton radioButtonBachillerato;
	private JRadioButton radioButtonCicloMedio;
	private JRadioButton radioButtonCicloSuperior;
	private JButton botonCargarCurriculum;

	public Principal() {
		setTitle("Formulario para Alumno de FP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());

		JPanel panelFormulario = new JPanel();
		panelFormulario.setLayout(new GridLayout(9, 1, 8, 5));
		
		// Panel dónde se crea el formulario principal
		JLabel labelNombre = new JLabel("Nombre:");
		textFieldNombre = new JTextField();
		JLabel labelApellidos = new JLabel("Apellidos:");
		textFieldApellidos = new JTextField();
		JLabel labelEdad = new JLabel("Edad:");
		textFieldEdad = new JTextField();
		JLabel labelComentarios = new JLabel("Comentarios:");
		textAreaComentarios = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textAreaComentarios);
		checkBoxJava = new JCheckBox("Java");
		checkBoxPython = new JCheckBox("Python");
		radioButtonBachillerato = new JRadioButton("Bachillerato");
		radioButtonCicloMedio = new JRadioButton("Ciclo Medio");
		radioButtonCicloSuperior = new JRadioButton("Ciclo Superior");
		ButtonGroup groupNivelEstudios = new ButtonGroup();
		groupNivelEstudios.add(radioButtonBachillerato);
		groupNivelEstudios.add(radioButtonCicloMedio);
		groupNivelEstudios.add(radioButtonCicloSuperior);
		botonCargarCurriculum = new JButton("Sube tu CV");
		
		
		panelFormulario.add(labelNombre);
		panelFormulario.add(textFieldNombre);
		panelFormulario.add(labelApellidos);
		panelFormulario.add(textFieldApellidos);
		panelFormulario.add(labelEdad);
		panelFormulario.add(textFieldEdad);
		panelFormulario.add(labelComentarios);
		panelFormulario.add(scrollPane);
		panelFormulario.add(checkBoxJava);
		panelFormulario.add(checkBoxPython);
		panelFormulario.add(radioButtonBachillerato);
		panelFormulario.add(radioButtonCicloMedio);
		panelFormulario.add(radioButtonCicloSuperior);
		panelFormulario.add(botonCargarCurriculum);

		getContentPane().add(panelFormulario, BorderLayout.CENTER);

		JPanel panelBotones = new JPanel();
		JButton botonCerrar = new JButton("Cerrar");
		JButton botonAceptar = new JButton("Aceptar");
		panelBotones.add(botonCerrar);
		panelBotones.add(botonAceptar);
		getContentPane().add(panelBotones, BorderLayout.SOUTH);

		botonAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Recopilar la información del formulario
				String nombre = textFieldNombre.getText();
				String apellidos = textFieldApellidos.getText();
				String edad = textFieldEdad.getText();
				String comentarios = textAreaComentarios.getText();
				boolean javaChecked = checkBoxJava.isSelected();
				boolean pythonChecked = checkBoxPython.isSelected();
				String nivelEstudios = "";
				if (radioButtonBachillerato.isSelected()) {
					nivelEstudios = "Bachillerato";
				} else if (radioButtonCicloMedio.isSelected()) {
					nivelEstudios = "Ciclo Medio";
				} else if (radioButtonCicloSuperior.isSelected()) {
					nivelEstudios = "Ciclo Superior";
				}

				// Mostrar la información en un JOptionPane
				String mensaje = "Nombre: " + nombre + "\n" + "Apellidos: " + apellidos + "\n" + "Edad: " + edad + "\n"
						+ "Comentarios: " + comentarios + "\n" + "Java: " + javaChecked + "\n" + "Python: "
						+ pythonChecked + "\n" + "Nivel de Estudios: " + nivelEstudios;

				JOptionPane.showMessageDialog(Principal.this, mensaje, "Información del Formulario",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		botonCerrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Abrir ventana de agradecimiento
				mostrarVentanaAgradecimiento();
			}
		});
		botonCargarCurriculum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Código que se utiliza para cargar el currículum
				JFileChooser fileChooser = new JFileChooser();
				int seleccion = fileChooser.showOpenDialog(Principal.this);

				if (seleccion == JFileChooser.APPROVE_OPTION) {
					File archivoSeleccionado = fileChooser.getSelectedFile();
					JOptionPane.showMessageDialog(Principal.this,
							"Curriculum cargado: " + archivoSeleccionado.getName(), "Curriculum Cargado",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		pack();
		setLocationRelativeTo(null);
	}

	private void mostrarVentanaAgradecimiento() {
		JDialog dialogoAgradecimiento = new JDialog(Principal.this, "Agradecimiento", true);
		dialogoAgradecimiento.getContentPane().setLayout(new BorderLayout());

		JLabel labelAgradecimiento = new JLabel("Gracias.");
		labelAgradecimiento.setHorizontalAlignment(SwingConstants.CENTER);

		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Cierra ventana agradecimiento
				dialogoAgradecimiento.dispose();

				// Cierra aplicación
				System.exit(0);
			}
		});
		
		JPanel panelAgradecimiento = new JPanel();
		panelAgradecimiento.add(labelAgradecimiento);

		JPanel panelBoton = new JPanel();
		panelBoton.add(botonAceptar);

		dialogoAgradecimiento.getContentPane().add(panelAgradecimiento, BorderLayout.CENTER);
		dialogoAgradecimiento.getContentPane().add(panelBoton, BorderLayout.SOUTH);

		dialogoAgradecimiento.setSize(300, 150);
		dialogoAgradecimiento.setLocationRelativeTo(Principal.this);
		dialogoAgradecimiento.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Principal ventana = new Principal();
			ventana.setVisible(true);
		});
	}
}