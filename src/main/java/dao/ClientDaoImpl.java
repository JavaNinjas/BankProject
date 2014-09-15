package dao;

import entity.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import java.util.ArrayList;
import java.util.List;

public class ClientDaoImpl extends GenericDaoImpl {
    private SessionFactory sf;

    public ClientDaoImpl() {
        Configuration configuration = new Configuration();
        //configuration.configure("hibernate-local.cfg.xml");
        configuration.configure("hibernate-heroku.cfg.xml");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sf = configuration.buildSessionFactory(serviceRegistry);
    }

    public Client getById(int id) {
        Session session = null;
        Client res = null;
        try {
            session = sf.openSession();
            res = (Client) session.get(Client.class, id);
        } finally {
            destroy();
        }
        return res;
    }

    @SuppressWarnings("unchecked")
    public Client getByEmail(String email) {
        Session session = null;
        Client res = null;
        try {
            session = sf.openSession();
            List<Client> list = session.createCriteria(Client.class)
                    .add(Restrictions.like("email", email)).list();
            res = list.get(0);
        } finally {
            destroy();
        }
        return res;
    }

    @Override
    public void update(Object object) {
        Session session = null;
        try {
            session = sf.openSession();
            session.beginTransaction();
            session.saveOrUpdate(object);
            session.getTransaction().commit();
        } finally {
            destroy();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Client> getAll() {
        Session session = null;
        List<Client> objects = new ArrayList<Client>();
        try {
            session = sf.openSession();
            objects = (ArrayList) session.createCriteria(Client.class).list();
        } finally {
            destroy();
        }
        return objects;
    }
}
