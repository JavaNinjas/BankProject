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
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        return (Client) session.get(Client.class, id);
    }

    @SuppressWarnings("unchecked")
    public Client getByEmail(String email) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Client> list = session.createCriteria(Client.class)
                .add(Restrictions.like("email", email))
                .list();
        Client res = list.get(0);
        session.getTransaction().commit();
        return res;
    }

    @Override
    public void update(Object object) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(object);
        session.getTransaction().commit();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Client> getAll() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Client> objects = new ArrayList<Client>();
        session.beginTransaction();
        objects = (ArrayList) session.createCriteria(Client.class).list();
        session.getTransaction().commit();
        return objects;
    }
}
