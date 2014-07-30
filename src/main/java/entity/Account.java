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
    protected int ID;

    @Column(name="CREATED")
    private String date;

    @Column(name="QUANTITY")
    private int quantity;

    @ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    private Client client;

    public Account() {
    }

    public Account(int quantity) {
        this.date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar.getInstance().getTime());
        this.quantity = quantity;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "entity.Account{" +
                "ID=" + ID +
                ", date='" + date + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}




		