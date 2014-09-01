package entity;

import dao.AccountDaoImpl;
import dao.TransactionDaoImpl;
import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue
    @Column(name = "transaction_id")
    private int transactionId;

    @ManyToOne
    @JoinColumn(name = "sender", nullable = false)
    private Client sender;

    @ManyToOne
    @JoinColumn(name = "receiver", nullable = false)
    private Client receiver;

    @Column(name = "currency")
    private String currency;

    @Column(name = "amount")
    private int amount;

    @Column(name = "occured")
    private String occurred;

    public Transaction() {
    }

    public Transaction(Client sender, Client receiver, String currency, int amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.currency = currency;
        this.occurred = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar.getInstance().getTime());

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
