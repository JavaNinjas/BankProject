package dao;

import entity.Account;
import entity.Client;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountDaoImpl extends GenericDaoImpl {
    private SessionFactory sf;

    public AccountDaoImpl() {
        Configuration configuration = new Configuration();
        //configuration.configure("hibernate-local.cfg.xml");
        configuration.configure("hibernate-heroku.cfg.xml");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sf = configuration.buildSessionFactory(serviceRegistry);
    }

    @Override
    public void save(Object obj) {
        Session session = null;
        try {
            sf.openSession();
            Account account = (Account) obj;
            Client client = account.getClient();
            if (client.getAccounts().size() > 4) {
                throw new IndexOutOfBoundsException("Only 4 accounts allowed");
            } else {
                session = sf.openSession();
                session.beginTransaction();
                session.save(obj);
                session.getTransaction().commit();
            }
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
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

    public Account getByClient(Client client) {
        Session session = null;
        Account res = null;
        try {
            session = sf.openSession();
            String hql = "from Account a where a.client.id=" + client.getClient_id();
            Query query = session.createQuery(hql);
            res = (Account) query.list().get(0);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return res;
    }

    public Account getByCurrency(Client client, String currency) {
        Session session = null;
        Account res = null;
        try {
            session = sf.openSession();
            String hql = "from Account a where a.client.id=" + client.getClient_id();
            Query query = session.createQuery(hql);
            List<Account> accountList = (ArrayList<Account>) query.list();
            for (Account account : accountList) {
                if (account.getCurrency().equals(currency)) {
                    res = account;
                }
            }
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return res;
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
