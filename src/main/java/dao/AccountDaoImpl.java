package dao;

import entity.Account;
import entity.Client;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class AccountDaoImpl extends GenericDaoImpl {
    private Session session;

    public AccountDaoImpl() {
    }

    @Override
    public void save(Object obj) {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(obj);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public Account getById(int id) {
        Account res = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            res = (Account) session.get(Account.class, id);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return res;
    }

    public Account getByClient(Client client) {
        Account res = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            String hql = "from Account a where a.client.id=" + client.getClient_id();
            Query query = session.createQuery(hql);
            res = (Account) query.list().get(0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return res;
    }

    public Account getByCurrency(Client client, String currency) {
        Account res = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            res = null;
            String hql = "from Account a where a.client.id=" + client.getClient_id();
            session.beginTransaction();
            Query query = session.createQuery(hql);
            List<Account> accountList = (ArrayList<Account>) query.list();
            for (Account account : accountList) {
                if (account.getCurrency().equals(currency)) {
                    res = account;
                }
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return res;
    }

    @Override
    public List<Account> getAll() {
        List<Account> objects = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            objects = (ArrayList) session.createCriteria(Account.class).list();
            session.getTransaction().commit();
            return objects;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return objects;
    }
}
