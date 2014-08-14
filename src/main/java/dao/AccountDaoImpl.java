package dao;

import entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

public class AccountDaoImpl extends GenericDaoImpl {
    private SessionFactory sf;

    public AccountDaoImpl() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate-local.cfg.xml");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sf = configuration.buildSessionFactory(serviceRegistry);
    }

    public Account getById(int id) {
        Session session = null;
        Account res = null;
        try {
            session = sf.openSession();
            res = (Account) session.get(Account.class, id);
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return res;
    }

    @Override
    public List<Account> read() {
        Session session = null;
        List<Account> objects = new ArrayList<Account>();
        try {
            session = sf.openSession();
            objects = (ArrayList) session.createCriteria(Account.class).list();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return objects;
    }

    public void deleteById(int id) {
        Session session = null;
        Account res = null;
        try {
            session = sf.openSession();
            res = (Account) session.get(Account.class, id);
            session.close();
            delete(res);
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
    }
}
