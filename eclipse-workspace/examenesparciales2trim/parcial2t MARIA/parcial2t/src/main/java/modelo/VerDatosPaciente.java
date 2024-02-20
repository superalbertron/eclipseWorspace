package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class VerDatosPaciente {

	public static void main(String[] args) {
		// Configurar la sesión de Hibernate:
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		// Configurar la sesión en el contexto actual:
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			// Obtener la sesión actual:
			Session session = context.currentSession();

			// Iniciar transacción:
			session.beginTransaction();

			// Crear consulta HQL para seleccionar todos los registros de la tabla pacientes:
			String hql = "FROM Paciente";
			Query<Paciente> query = session.createQuery(hql, Paciente.class);

			// Ejecutar consulta y obtener resultados:
			List<Paciente> pacientes = query.list();

			// Imprimir resultados:
			System.out.println("Registros en la tabla pacientes:");

			for (Paciente p : pacientes) {
				System.out.println(p.toString());
			}

			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			context.unbind(sessionFactory);
			sessionFactory.close();
		}
	}
}