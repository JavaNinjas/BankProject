package entity;

import dao.AccountDaoImpl;
import dao.ClientDaoImpl;
import dao.TransactionDaoImpl;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "account_id")
    private int account_id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(name = "created")
    private String date;

    @Column(name = "balance")
    private String balance;

    @Column(name = "currency")
    private String currency;

    public Account() {
    }

    public Account(Client client, String balance, String currency) {
        this.client = client;
        this.date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar.getInstance().getTime());
        this.balance = balance;
        this.currency = currency;
    }

    public int getAccount_id() {
        return account_id;
    }

    public String getDate() {
        return date;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String quantity) {
        this.balance = quantity;
    }

    public Client getClient() {
        return client;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(client.getLastName());
        sb.append("'s account | ");
        sb.append(currency);
        sb.append(" ").append(balance);
        return sb.toString();
    }

    public static void main(String[] args) {
//        ClientDaoImpl clientDao = new ClientDaoImpl();
//        Client john = clientDao.getById(1);
//        Client paul = clientDao.getById(2);
//        Client george = clientDao.getById(3);
//        Client ringo = clientDao.getById(4);
//
//        new Transaction(paul, john, "USD", "1", "USD");
//        new Transaction(george, john, "USD", "1", "USD");
//        new Transaction(ringo, john, "USD", "1", "USD");
//
//        new Transaction(john, paul, "USD", "1", "USD");
//        new Transaction(john, george, "USD", "1", "USD");
//        new Transaction(john, ringo, "USD", "1", "USD");
    }
}




		
