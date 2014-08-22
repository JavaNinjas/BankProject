package entity;

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
    protected int transactionId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sender", nullable = false)
    private Client sender;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "receiver", nullable = false)
    private Client receiver;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "AMOUNT")
    private int amount;

    @Column(name = "DATE")
    private String date;

    public Transaction(Client sender, Client receiver, String currency, int amount) {
        Account senderAccount = new Account();
        Account receiverAccount = new Account();
        for (Account account : sender.getAccounts()) {
            if (account.getCurrency().equals(currency)) {
                senderAccount = account;
            }
        }
        for (Account account : receiver.getAccounts()) {
            if (account.getCurrency().equals(currency)) {
                receiverAccount = account;
            }
        }
        TransactionDaoImpl transactionDao = new TransactionDaoImpl();
        transactionDao.send(senderAccount, receiverAccount, amount);

        date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar.getInstance().getTime());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transaction{");
        sb.append(sender.getLastName()).append(" send");
        sb.append(amount).append(" " + currency);
        sb.append(" to ").append(receiver.getLastName());
        sb.append(" | ").append(date);
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

    public String getDate() {
        return date;
    }
}
