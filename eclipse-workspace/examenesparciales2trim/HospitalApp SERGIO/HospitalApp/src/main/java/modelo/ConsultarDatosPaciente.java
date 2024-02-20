package modelo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class ConsultarDatosPaciente {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            Session session = context.currentSession();

            session.beginTransaction();

            String hql = "FROM Paciente";
            Query<Paciente> query = session.createQuery(hql, Paciente.class);

            List<Paciente> pacientes = query.list();

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
