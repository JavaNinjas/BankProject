package entity;

import dao.AccountDaoImpl;
import dao.ClientDaoImpl;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CLIENTS")
public class Client {
    @Id
    @GeneratedValue
    @Column(name = "CLIENT_ID")
    private int client_id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PASSWORD")
    private String password;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "client")
    private Set<Account> accounts = new HashSet<Account>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "sender")
    private Set<Transaction> senderTransactions = new HashSet<Transaction>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "receiver")
    private Set<Transaction> receiverTransactions = new HashSet<Transaction>();

    public Client() {
    }

    public Client(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public int getClient_id() {
        return client_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(" ").append(lastName);
        return sb.toString();
    }
}