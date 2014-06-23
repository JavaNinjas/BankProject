import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

public class ClientDaoImpl {
    private SessionFactory sf;


    public ClientDaoImpl() {
        Configuration configuration = new Configuration();
        configuration.configure();

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sf = configuration.buildSessionFactory(serviceRegistry);
    }

    public void add(Client client) {
        Session session = null;
        try {
            session = sf.openSession();
            session.beginTransaction();
            session.save(client);
            session.getTransaction().commit();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
    }

    public void delete(Client client) {
        Session session = null;
        try {
            session = sf.openSession();
            session.beginTransaction();
            session.delete(client);
            session.getTransaction().commit();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
    }

    public ArrayList<Client> getAll() {
        Session session = null;
        ArrayList<Client> clients = new ArrayList<Client>();
        try {
            session = sf.openSession();
            clients = (ArrayList)session.createCriteria(Client.class).list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return clients;
    }

    public Client getById(int id) {
        Session session = null;
        Client res = null;
        try {
            session = sf.openSession();
            res = (Client) session.get(Client.class, id);
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return res;
    }
}
