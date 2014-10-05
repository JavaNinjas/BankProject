package dao;

import entity.Client;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class ClientDaoImpl extends GenericDaoImpl {
    private Session session;

    public ClientDaoImpl() {
    }

    public Client getById(int id) {
        Client res = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            res = (Client) session.get(Client.class, id);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return res;
    }

    public Client getByEmail(String email) {
        Client res = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            List<Client> list = session.createCriteria(Client.class)
                    .add(Restrictions.like("email", email))
                    .list();
            res = list.get(0);
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
    public void update(Object object) {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.saveOrUpdate(object);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public List<Client> getAll() {
        List<Client> objects = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            objects = (ArrayList) session.createCriteria(Client.class).list();
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
