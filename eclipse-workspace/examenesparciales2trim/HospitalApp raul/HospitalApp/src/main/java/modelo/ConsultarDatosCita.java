package modelo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class ConsultarDatosCita {

	public static void main(String[] args) {
		// Configurar la sesión de Hibernate
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

				// Configurar la sesión en el contexto actual
				ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
				context.bind(sessionFactory.openSession());
				
				try {
					// Obtener la sesión actual
					Session session = context.currentSession();

					// Iniciar transacción
					session.beginTransaction();

					// Crear consulta HQL para seleccionar todos los registros de la tabla
					// fabricante
					String hql = "FROM Cita";
					Query<Cita> query = session.createQuery(hql, Cita.class);

					// Ejecutar consulta y obtener resultados
					List<Cita> citas = query.list();

					// Imprimir resultados
					System.out.println("Registros en la tabla Cita:");
					for (Cita c : citas) {
						System.out.println(c.toString());
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
