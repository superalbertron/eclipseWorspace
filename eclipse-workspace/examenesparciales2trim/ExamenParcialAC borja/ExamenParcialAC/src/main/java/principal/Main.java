package principal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Date;
import java.util.Scanner;

public class Main {
	// Configurar Hibernate
	static Configuration configuration = new Configuration().configure();
	static SessionFactory sessionFactory = configuration.buildSessionFactory();
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		boolean salir = false;


		while (!salir) {
			System.out.println("------ Men� ------");
			System.out.println("1. Gestionar pacientes");
			System.out.println("2. Gestionar m�dicos");
			System.out.println("3. Gestionar citas");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opci�n: ");
			int opcionMenuPrincipal = scanner.nextInt();
			scanner.nextLine(); 

			switch (opcionMenuPrincipal) {
			case 1:
				gestionarPacientes(scanner);
				break;
			case 2:
				gestionarMedicos(scanner);
				break;
			case 3:
				
				System.out.println("WIP");
				break;
			case 4:
				salir = true;
				break;
			default:
				System.out.println("Opci�n inv�lida. Int�ntalo de nuevo.");
				break;
			}
		}
		System.out.println("�Hasta luego!");
	}

	private static void gestionarPacientes(Scanner scanner) {
		boolean volverMenuPrincipal = false;
		PacienteDAO pacienteDAO = new PacienteDAOHibernate(sessionFactory);

		while (!volverMenuPrincipal) {
			System.out.println("\n------ Men� Pacientes ------");
			System.out.println("1. Insertar paciente");
			System.out.println("2. Actualizar paciente");
			System.out.println("3. Mostrar lista de pacientes");
			System.out.println("4. Eliminar paciente");
			System.out.println("5. Volver al men� principal");
			System.out.print("Seleccione una opci�n: ");
			int opcionMenuPacientes = scanner.nextInt();
			scanner.nextLine(); // Consumir salto de l�nea

			switch (opcionMenuPacientes) {
			case 1:
				insertarPaciente(scanner, pacienteDAO);
				break;
			case 2:
				insertarPaciente(scanner, pacienteDAO);
				break;
			case 3:
		        for (Paciente paciente : pacienteDAO.getAllPacientes()) {
		            System.out.println(paciente.getNombre() + " " + paciente.getApellidos());
		        }
				break;
			case 4:
				System.out.println("WIP.");
				break;
			case 5:
				volverMenuPrincipal = true;
				break;
			default:
				System.out.println("Opci�n inv�lida. Int�ntalo de nuevo.");
				break;
			}
		}
	}

	private static void insertarPaciente(Scanner scanner, PacienteDAO pacienteDAO) {
		Paciente paciente = new Paciente();
		System.out.println("Ingrese el nombre del paciente:");
		paciente.setNombre(scanner.nextLine());
		System.out.println("Ingrese los apellidos del paciente:");
		paciente.setApellidos(scanner.nextLine());
		System.out.println("Ingrese la ciudad del paciente:");
		paciente.setCiudad(scanner.nextLine());
		System.out.println("Ingrese la direcci�n del paciente:");
		paciente.setDireccion(scanner.nextLine());
		System.out.println("Ingrese el tel�fono del paciente:");
		paciente.setTelefono(scanner.nextLine());
		System.out.println("Ingrese la edad del paciente:");
		paciente.setEdad(scanner.nextInt());
		scanner.nextLine(); // Consumir salto de l�nea
		System.out.println("Ingrese el historial del paciente:");
		paciente.setHistorial(scanner.nextLine());

		pacienteDAO.addPaciente(paciente);
		System.out.println("Paciente agregado con �xito.");
	}
	
	private static void gestionarMedicos(Scanner scanner) {
	    boolean volverMenuPrincipal = false;
	    MedicoDAO medicoDAO = new MedicoDAOHibernate(sessionFactory);

	    while (!volverMenuPrincipal) {
	        System.out.println("\n------ Men� M�dicos ------");
	        System.out.println("1. Insertar m�dico");
	        System.out.println("2. Actualizar m�dico");
	        System.out.println("3. Mostrar lista de m�dicos");
	        System.out.println("4. Eliminar m�dico");
	        System.out.println("5. Volver al men� principal");
	        System.out.print("Seleccione una opci�n: ");
	        int opcionMenuMedicos = scanner.nextInt();
	        scanner.nextLine(); // Consumir salto de l�nea

	        switch (opcionMenuMedicos) {
	            case 1:
	                insertarMedico(scanner, medicoDAO);
	                break;
	            case 2:
	                insertarMedico(scanner, medicoDAO);
	                break;
	            case 3:
	            	for (Medico medico : medicoDAO.getAllMedicos()) {
	                    System.out.println(medico.getNombre() + " " + medico.getApellidos() + " - " + medico.getEspecialidad());
	                }
	                break;
	            case 4:
	                System.out.println("WIP");
	                break;
	            case 5:
	                volverMenuPrincipal = true;
	                break;
	            default:
	                System.out.println("Opci�n inv�lida. Int�ntalo de nuevo.");
	                break;
	        }
	    }
	}

	private static void gestionarCitas(Scanner scanner) {
	    boolean volverMenuPrincipal = false;
	    CitaDAO citaDAO = new CitaDAOHibernate(sessionFactory);

	    while (!volverMenuPrincipal) {
	        System.out.println("\n------ Men� Citas ------");
	        System.out.println("1. Insertar cita");
	        System.out.println("2. Actualizar cita");
	        System.out.println("3. Mostrar lista de citas");
	        System.out.println("4. Eliminar cita");
	        System.out.println("5. Volver al men� principal");
	        System.out.print("Seleccione una opci�n: ");
	        int opcionMenuCitas = scanner.nextInt();
	        scanner.nextLine(); // Consumir salto de l�nea

	        switch (opcionMenuCitas) {
	            case 1:
	                System.out.println("Las cistas esta work in progress");
	                break;
	            case 2:
	            	System.out.println("Las cistas esta work in progress");
	                break;
	            case 3:
	            	System.out.println("Las cistas esta work in progress");
	                break;
	            case 4:
	            	System.out.println("Las cistas esta work in progress");
	                break;
	            case 5:
	                volverMenuPrincipal = true;
	                break;
	            default:
	                System.out.println("Opci�n inv�lida. Int�ntalo de nuevo.");
	                break;
	        }
	    }
	}


	
	private static void insertarMedico(Scanner scanner, MedicoDAO medicoDAO) {
	    Medico medico = new Medico();
	    System.out.println("Ingrese el nombre del m�dico:");
	    medico.setNombre(scanner.nextLine());
	    System.out.println("Ingrese los apellidos del m�dico:");
	    medico.setApellidos(scanner.nextLine());
	    System.out.println("Ingrese la especialidad del m�dico:");
	    medico.setEspecialidad(scanner.nextLine());

	    medicoDAO.addMedico(medico);
	    System.out.println("M�dico agregado con �xito.");
	}

	

	private static void mostrarListaPacientes(PacienteDAO pacienteDAO) {
		System.out.println("\nLista de pacientes:");
		for (Paciente paciente : pacienteDAO.getAllPacientes()) {
			System.out.println(paciente.getNombre() + " " + paciente.getApellidos());
		}

		sessionFactory.close();
	}
}
