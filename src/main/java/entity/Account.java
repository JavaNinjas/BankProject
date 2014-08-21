package entity;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
@Table(name="ACCOUNTS")
public class Account {
    @Id
    @GeneratedValue
    @Column(name="ACCOUNT_ID")
    protected int account_id;

    @ManyToOne
    @JoinColumn (name = "client_id", nullable = false)
    private Client client;

    @Column(name="CREATED")
    private String date;

    @Column(name="QUANTITY")
    private int quantity;

    @Column(name="CURRENCY")
    private String currency;

    public Account() {
    }

    public Account(Client client, int quantity, String currency) {
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCurrency(){return currency;}

    @Override
    public String toString() {
        return "entity.Account{" +
                "ID=" + account_id +
                ", date='" + date + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}




		
