package entity;

import dao.AccountDaoImpl;
import dao.ClientDaoImpl;
import dao.TransactionDaoImpl;

public class EntityTest {
    public static void main(String[] args) {
        System.out.println(123);

        ClientDaoImpl clientDao = new ClientDaoImpl();

        Client sender = clientDao.getById(2);
        Client receiver = clientDao.getById(3);

        Transaction transaction = new Transaction(sender, receiver, "UAH", 150);

        TransactionDaoImpl transactionDao = new TransactionDaoImpl();
        transactionDao.create(transaction);


    }
}



