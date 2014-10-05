package dao;

import entity.Account;
import entity.Client;
import entity.Transaction;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class TransactionDaoImpl extends GenericDaoImpl {
    private Session session;

    public TransactionDaoImpl() {
    }

    public void send(Account sender, Account receiver, String amountSent, String amountReceived) {
        Double amountParsed1 = Double.parseDouble(amountSent);
        Double res1 = Double.parseDouble(sender.getBalance()) - amountParsed1;
        sender.setBalance(String.valueOf(res1));
        Double amountParsed2 = Double.parseDouble(amountReceived);
        Double res2 = Double.parseDouble(receiver.getBalance()) + amountParsed2;
        receiver.setBalance(String.valueOf(res2));
    }

    public List<Transaction> getByClient(Client client) {
        List<Transaction> objects = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            String hql = "from Transaction t where t.sender.id=" + client.getClient_id();
            Query query = session.createQuery(hql);
            objects = query.list();
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

    @Override
    public List getAll() {
        return null;
    }
}

