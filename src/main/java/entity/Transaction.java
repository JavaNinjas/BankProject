package entity;

import dao.AccountDaoImpl;
import dao.ClientDaoImpl;
import dao.TransactionDaoImpl;
import org.joda.money.Money;
import parser.Converter;
import parser.Parser;

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
    @JoinColumn(name = "sender_id", nullable = false)
    private Client sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id", nullable = false)
    private Client receiver;

    @Column(name = "amountSent")
    private String amountSent;

    @Column(name = "currencySent")
    private String currencySent;

    @Column(name = "amountReceived")
    private String amountReceived;

    @Column(name = "currencyReceived")
    private String currencyReceived;

    @Column(name = "occurred")
    private String occurred;

    public Transaction() {
    }

    // Sending funds between accounts
    public Transaction(Client sender, Client receiver, String currencySent, String amountSent, String currencyReceived) {
        this.sender = sender;
        this.receiver = receiver;
        this.amountSent = amountSent;
        this.currencySent = currencySent;
        this.currencyReceived = currencyReceived;
        this.occurred = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar.getInstance().getTime());

        exchange(currencySent, amountSent, currencyReceived);

        AccountDaoImpl accountDao = new AccountDaoImpl();
        Account senderAccount = accountDao.getByCurrency(sender, currencySent);
        Account receiverAccount = accountDao.getByCurrency(receiver, currencyReceived);

        TransactionDaoImpl transactionDao = new TransactionDaoImpl();

        transactionDao.send(senderAccount, receiverAccount, amountSent, amountReceived);

        accountDao.update(senderAccount);
        accountDao.update(receiverAccount);

        transactionDao.save(this);

        accountDao.destroy();
        transactionDao.destroy();

    }

    private void exchange(String currencySent, String amountSent, String currencyReceived) {
        if (currencySent.equals(currencyReceived)) {
            this.amountReceived = amountSent;
        } else {
            Money sent = Money.parse(currencySent + " " + amountSent);
            double exchangeRate = Parser.getRate(currencySent + currencyReceived);
            String result = Converter.convert(sent, exchangeRate);
            this.amountReceived = String.valueOf(Double.parseDouble(result.substring(3)));
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(sender.getLastName()).append(" send ");
        sb.append(amountSent).append(" " + currencySent);
        sb.append(" to ").append(receiver.getLastName());
        sb.append(" | ").append(receiver.getLastName());
        sb.append(" received").append(" ").append(amountReceived);
        sb.append(" ").append(currencyReceived);
        sb.append(" | ").append(occurred);
        return sb.toString();
    }

    public Client getSender() {
        return sender;
    }

    public Client getReceiver() {
        return receiver;
    }

    public String getCurrencySent() {
        return currencySent;
    }

    public String getCurrencyReceived() {
        return currencyReceived;
    }

    public String getAmountSent() {
        return amountSent;
    }

    public String getAmountReceived() {
        return amountReceived;
    }

    public String getOccurred() {
        return occurred;
    }

    public static void main(String[] args) {
        ClientDaoImpl clientDao = new ClientDaoImpl();
        Client sender = clientDao.getById(25);
        Client receiver = clientDao.getById(26);

        Transaction transaction = new Transaction(sender, receiver, "UAH", "500", "USD");

    }
}
