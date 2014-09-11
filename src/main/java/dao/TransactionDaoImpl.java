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

    public void send(Account sender, Account receiver,String amountSent, String amountReceived) {

        System.out.println(sender.getCurrency());
        System.out.println(receiver.getCurrency());

        Double amountParsed1 = Double.parseDouble(amountSent);
        System.out.println("amount sent: " + amountParsed1 );

        Double res1 = Double.parseDouble(sender.getBalance()) - amountParsed1;
        System.out.println(res1.toString());

        sender.setBalance(String.valueOf(res1));
        System.out.println(sender.getBalance());

        Double amountParsed2 = Double.parseDouble(amountReceived);
        System.out.println("amount received: " + amountParsed1 );

        Double res2 = Double.parseDouble(receiver.getBalance()) + amountParsed2;
        System.out.println(res2.toString());

        receiver.setBalance(String.valueOf(res2));
        System.out.println(receiver.getBalance());
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

