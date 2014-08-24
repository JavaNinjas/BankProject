package entity;

import dao.AccountDaoImpl;
import dao.TransactionDaoImpl;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
@Table(name = "TRANSACTIONS")
public class Transaction {

    @Id
    @GeneratedValue
    @Column(name = "transaction_id")
    private int transactionId;

    @ManyToOne
    @JoinColumn(name = "sender_id", nullable = false)
    private Client sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id", nullable = false)
    private Client receiver;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "AMOUNT")
    private int amount;

    @Column(name = "OCCURRED")
    private String occurred = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar.getInstance().getTime());

    public Transaction() {
    }

    public Transaction(Client sender, Client receiver, String currency, int amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.currency = currency;

        AccountDaoImpl accountDao = new AccountDaoImpl();

        Account senderAccount = accountDao.getByClient(sender);
        Account receiverAccount = accountDao.getByClient(receiver);
        TransactionDaoImpl transactionDao = new TransactionDaoImpl();
        transactionDao.send(senderAccount, receiverAccount, amount);
        accountDao.update(senderAccount);
        accountDao.update(receiverAccount);
        transactionDao.save(this);

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(sender.getLastName()).append(" send ");
        sb.append(amount).append(" " + currency);
        sb.append(" to ").append(receiver.getLastName());
        sb.append(" | ").append(occurred);
        return sb.toString();
    }

    public Client getSender() {
        return sender;
    }

    public Client getReceiver() {
        return receiver;
    }

    public String getCurrency() {
        return currency;
    }

    public int getAmount() {
        return amount;
    }

    public String getOccurred() {
        return occurred;
    }
}
