package entity;

import dao.AccountDaoImpl;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
@Table(name="ACCOUNTS")
public class Account {

    @Column(name="CLIENT_ID")
    private int client_id ;

    @Id
    @GeneratedValue
    @Column(name="ACCOUNT_ID")
    protected int account_id;

    @Column(name="CREATED")
    private String date;

    @Column(name="QUANTITY")
    private int quantity;

    public Account() {
    }

    public Account(int client_id, int quantity) {
        this.client_id = client_id;
        this.date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar.getInstance().getTime());
        this.quantity = quantity;
    }
    public void sendMoney(int number, int ToId){
        setQuantity(getQuantity() - number);//зменшуємо баланс того акаунта з якого ми визиваємо метод sendMoney
        AccountDaoImpl toAccount = new AccountDaoImpl();
        Account recipient = toAccount.getById(ToId);//для створеного обєкта класа AccountDaoImpl визиваєм метод getById(ToId) і передаєм туди іd рахунка отримувача
        recipient.setQuantity(getQuantity() + number);//пусля того як ми отримали акаунт отримувача, збільшуємо його баланс
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int ID) {
        this.account_id = ID;
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
                "ID=" + account_id +
                ", date='" + date + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}




		
