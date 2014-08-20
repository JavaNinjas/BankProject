package entity;

import javax.persistence.*;

@Entity
@Table(name="TRANSACTIONS")
public class Transaction {

    @Id
    @GeneratedValue
    @Column(name="T_ID")
    protected int transactionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Client sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Client receiver;

    @Column(name="CURRENCY")
    private String currency;

    @Column(name="AMOUNT")
    private String amount;

    @Column(name="DATE")
    private String date;

    public Transaction() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transaction{");
        sb.append("from=").append(sender);
        sb.append(", to=").append(receiver);
        sb.append(", date='").append(date).append('\'');
        sb.append(", amount='").append(amount).append('\'');
        sb.append('}');
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

    public String getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
}
