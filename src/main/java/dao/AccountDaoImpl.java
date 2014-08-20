package dao;

import entity.Account;
import entity.Client;
import org.hibernate.Query;
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
            if (sf.getCurrentSession() != null) {
                session = sf.getCurrentSession();
            } else {
                session = sf.openSession();
            }
            res = (Account) session.get(Account.class, id);
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return res;
    }

    public List getByClient(Client client, String currency) {
        Session session = null;
        List list = null;
        try {
            session = sf.openSession();
            String hql = "from Account a where a.id=" + client.getClient_id();
            Query query = session.createQuery(hql);
            list = query.list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return list;
    }

    @Override
    public List<Account> getAll() {
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
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
            delete(res);
        }
    }
}
