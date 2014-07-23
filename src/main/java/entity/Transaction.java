package entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {
    private Client from;
    private Client to;
    private String date;
    private String amount;

    public Transaction() {
    }

    public Transaction(Client from, Client to, String amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar.getInstance().getTime());
    }

    public Client getFrom() {
        return from;
    }

    public void setFrom(Client from) {
        this.from = from;
    }

    public Client getTo() {
        return to;
    }

    public void setTo(Client to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
