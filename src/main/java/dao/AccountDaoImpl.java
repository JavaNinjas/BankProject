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
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(obj);
        session.getTransaction().commit();
    }

    public Account getById(int id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Account res = (Account) session.get(Account.class, id);
        return res;
    }

    public Account getByClient(Client client) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        String hql = "from Account a where a.client.id=" + client.getClient_id();
        Query query = session.createQuery(hql);
        Account res = (Account) query.list().get(0);
        return res;
    }

    public Account getByCurrency(Client client, String currency) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Account res = null;
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
        return res;
    }

    @Override
    public List<Account> getAll() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Account> objects = new ArrayList<Account>();
        session.beginTransaction();
        objects = (ArrayList) session.createCriteria(Account.class).list();
        session.getTransaction().commit();
        return objects;
    }
}
