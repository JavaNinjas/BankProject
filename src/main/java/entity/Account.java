package entity;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
@Table(name = "ACCOUNTS")
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "ACCOUNT_ID")
    private int account_id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(name = "CREATED")
    private String date;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "CURRENCY")
    private String currency;

    public Account() {
    }

    public Account(Client client, String quantity, String currency) {
        this.client = client;
        this.date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar.getInstance().getTime());
        this.quantity = quantity;
        this.currency = currency;
    }

    public int getAccount_id() {
        return account_id;
    }

    public String getDate() {
        return date;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
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
        sb.append(" ").append(quantity);
        return sb.toString();
    }
}




		
