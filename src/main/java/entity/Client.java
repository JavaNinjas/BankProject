package entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CLIENTS")
public class Client {

    @Id
    @GeneratedValue
    @Column(name = "CLIENT_ID")
    protected int client_id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PASSWORD")
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "account_id")
    private Set<Account> accounts;

    public Client() {
    }

    public Client(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public long getClient_id() {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(client_id).append(" |");
        sb.append(" ").append(firstName);
        sb.append(" ").append(lastName);
        return sb.toString();
    }
}