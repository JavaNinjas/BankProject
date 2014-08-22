package dao;

import entity.Account;
import entity.Client;
import entity.Transaction;
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
        configuration.configure("hibernate-local.cfg.xml");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sf = configuration.buildSessionFactory(serviceRegistry);
    }

    public void send(Account sender, Account receiver, int amount) {
        sender.setQuantity(sender.getQuantity() - amount);
        receiver.setQuantity(receiver.getQuantity() + amount);
    }

    @Override
    public List getAll() {
        Session session = null;
        List<Client> objects = new ArrayList<Client>();
        try {
            session = sf.openSession();
            objects = (ArrayList) session.createCriteria(Transaction.class).list();
        } finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return objects;
    }
}

