import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
@Table
public class Account {

    private int clientID;
    private String date;
    private String UAH;
    private String USD;
    private String Euro;

    public Account() {
    }

    public Account(String UAH) {
        this.UAH = UAH;
        USD = "US Dollars";
        Euro = "Euro";
        date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar.getInstance().getTime());
    }

    @Override
    public String toString() {
        return "main.java.Account{" +
                "clientID=" + clientID +
                ", date='" + date + '\'' +
                ", UAH='" + UAH + '\'' +
                ", USD='" + USD + '\'' +
                ", Euro='" + Euro + '\'' +
                '}';
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUAH() {
        return UAH;
    }

    public void setUAH(String UAH) {
        this.UAH = UAH;
    }

    public String getUSD() {
        return USD;
    }

    public void setUSD(String USD) {
        this.USD = USD;
    }

    public String getEuro() {
        return Euro;
    }

    public void setEuro(String euro) {
        Euro = euro;
    }
}




		
