package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import model.Paciente;
import model.PlantillaDAO;

public class PacienteDAO implements PlantillaDAO {

	private ArrayList obtenerSession() {
		ArrayList sesiones = new ArrayList();
		// Configurar la sesion del Hibernate
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		try {
			// Configurar la sesion en el contexto actual
			ThreadLocalSessionContext context = new ThreadLocalSessionContext(
					(SessionFactoryImplementor) sessionFactory);
			context.bind(sessionFactory.openSession());
			// Obtener la sesion actual
			Session session = context.currentSession();
			// Iniciar transaccion
			session.beginTransaction();
			// Añadir session y factory al ArrayList para exportarlo.
			sesiones.add(sessionFactory);
			sesiones.add(session);

			return sesiones;
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		return null;
	} // fun

	private void cerrarSession(SessionFactory sessionFactory) {
		// Desligar la sesion del contexto
		ThreadLocalSessionContext.unbind(sessionFactory);
		// Cerrar la sesion del Hibernate
		sessionFactory.close();
	} // fun

	@Override
	public void agregarRegistro(Object obj) {
		// Sessiones
		ArrayList sesiones = obtenerSession();
		SessionFactory sessionFactory = (SessionFactory) sesiones.get(0);
		Session session = (Session) sesiones.get(1);
		// Crea el objeto Paciente
		Paciente paciente = (Paciente) obj;
		// Guardar objeto en la base de datos
		session.save(paciente);
		// Hacer el commit de la transaccion
		session.getTransaction().commit();

		System.out.println(paciente.toString());
		cerrarSession(sessionFactory);
	} // fun

	@Override
	public void actualizarRegistro(int id, String campo, String valor) {
		int valorNum;
		String updateHql;
		// Sessiones
		ArrayList sesiones = obtenerSession();
		SessionFactory sessionFactory = (SessionFactory) sesiones.get(0);
		Session session = (Session) sesiones.get(1);

		// Modificar los datos y comprobar si es int.
		if (isInt(valor)) {
			int x = Integer.parseInt(valor);
			valorNum = x;
			updateHql = "UPDATE Paciente SET " + campo + " = '" + valorNum + "' WHERE id = " + id;
		} else {
			updateHql = "UPDATE Paciente SET " + campo + " = '" + valor + "' WHERE id = " + id;
		} // else

		Query<?> updateQuery = session.createQuery(updateHql);
		updateQuery.executeUpdate();

		// Realizar una nueva consulta para obtener los datos actualizados
		String selectHql = "FROM Paciente WHERE id = " + id;
		Query<Paciente> selectQuery = session.createQuery(selectHql, Paciente.class);
		List<Paciente> pacientes = selectQuery.list();

		// Imprimir resultados
		System.out.println("Registros en la tabla después de la actualización:");
		for (Paciente i : pacientes) {
			System.out.println(i.toString());
		} // for

		session.getTransaction().commit();
		cerrarSession(sessionFactory);
	} // fun

	@Override
	public void eliminarRegistro(int id) {
		// Sessiones
		ArrayList sesiones = obtenerSession();
		SessionFactory sessionFactory = (SessionFactory) sesiones.get(0);
		Session session = (Session) sesiones.get(1);

		// Eliminar el registro
		String deleteHql = "DELETE FROM Paciente WHERE id = " + id;
		Query<?> deleteQuery = session.createQuery(deleteHql);
		deleteQuery.executeUpdate();

		System.out.println("El Paciente ha sido eliminado.");

		session.getTransaction().commit();
		cerrarSession(sessionFactory);
	} // fun

	@Override
	public void obtenerRegistro(int id) {
		// Sessiones
		ArrayList sesiones = obtenerSession();
		SessionFactory sessionFactory = (SessionFactory) sesiones.get(0);
		Session session = (Session) sesiones.get(1);

		String hql = "FROM Paciente WHERE id = " + id;
		Query<Paciente> query = session.createQuery(hql, Paciente.class);
		// Ejecutar consulta y obtener resultados
		List<Paciente> pacientes = query.list();

		// Imprimir resultados
		for (Paciente i : pacientes) {
			System.out.println(i.toString());
		} // for

		session.getTransaction().commit();
		cerrarSession(sessionFactory);
	} // fun

	@Override
	public void obtenerTodosLosRegistros() {
		// Sessiones
				ArrayList sesiones = obtenerSession();
				SessionFactory sessionFactory = (SessionFactory) sesiones.get(0);
				Session session = (Session) sesiones.get(1);

				String hql = "FROM Paciente";
				Query<Paciente> query = session.createQuery(hql, Paciente.class);
				// Ejecutar consulta y obtener resultados
				List<Paciente> pacientes = query.list();

				// Imprimir resultados
				System.out.println("Registros en la tabla Paciente:");
				for (Paciente i : pacientes) {
					System.out.println(i.toString());
				} // for

				session.getTransaction().commit();
				cerrarSession(sessionFactory);
	} // fun

	public static boolean isInt(String str) {
		try {
			int x = Integer.parseInt(str);
			return true; // String is an Integer
		} catch (NumberFormatException e) {
			return false; // String is not an Integer
		} // catch
	} // fun

} // class