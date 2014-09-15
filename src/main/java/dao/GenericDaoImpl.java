package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {
    private SessionFactory sf;

    public GenericDaoImpl() {
        Configuration configuration = new Configuration();
        //configuration.configure("hibernate-local.cfg.xml");
        configuration.configure("hibernate-heroku.cfg.xml");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sf = configuration.buildSessionFactory(serviceRegistry);
    }

    public void destroy() {
        if (!sf.isClosed()) sf.close();
    }

    public void save(T obj) {
        Session session = null;
        try {
            session = sf.openSession();
            session.beginTransaction();
            session.save(obj);
            session.getTransaction().commit();
        } finally {
            destroy();
        }
    }

    public abstract List<T> getAll();

    public void update(T obj) {
        Session session = null;
        try {
            session = sf.openSession();
            session.beginTransaction();
            session.saveOrUpdate(obj);
            session.getTransaction().commit();
        } finally {
            destroy();
        }
    }

    public void delete(T obj) {
        Session session = null;
        try {
            session = sf.openSession();
            session.beginTransaction();
            session.delete(obj);
            session.getTransaction().commit();
        } finally {
            destroy();
        }
    }
}

