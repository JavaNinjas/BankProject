package dao;

import entity.Account;
import entity.Client;
import entity.Transaction;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

public class TransactionDaoImpl extends GenericDaoImpl {
    private SessionFactory sf;

    public TransactionDaoImpl() {
        Configuration configuration = new Configuration();
        //configuration.configure("hibernate-local.cfg.xml");
        configuration.configure("hibernate-heroku.cfg.xml");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sf = configuration.buildSessionFactory(serviceRegistry);
    }

    public void send(Account sender, Account receiver,String amountSent, String amountReceived) {
        Double amountParsed1 = Double.parseDouble(amountSent);
        Double res1 = Double.parseDouble(sender.getBalance()) - amountParsed1;
        sender.setBalance(String.valueOf(res1));
        Double amountParsed2 = Double.parseDouble(amountReceived);
        Double res2 = Double.parseDouble(receiver.getBalance()) + amountParsed2;
        receiver.setBalance(String.valueOf(res2));
    }

    public List<Transaction> getByClient(Client client) {
        Session session = null;
        List<Transaction> objects = new ArrayList<>();
            try {
                session = sf.openSession();
                String hql = "from Transaction t where t.sender.id=" + client.getClient_id();
                Query query = session.createQuery(hql);
                objects = query.list();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return objects;
    }

    @Override
    public List getAll() {
        return null;
    }
}

