package entity;

import dao.AccountDaoImpl;
import dao.ClientDaoImpl;

public class EntityTest {
    public static void main(String[] args) {

        ClientDaoImpl clientDao = new ClientDaoImpl();
        Client lennon = clientDao.getById(3);
        Client mccartney = clientDao.getById(4);


        Transaction transaction = new Transaction(mccartney, lennon, "USD", 200);

    }
}




