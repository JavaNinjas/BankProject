package entity;

import dao.AccountDaoImpl;
import dao.ClientDaoImpl;

import javax.persistence.*;
import java.util.Random;
import java.util.Set;

@Entity
@Table(name = "CLIENTS")
public class Client {

    @Id
    @GeneratedValue
    @Column(name = "CLIENT_ID")
    protected int ID;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Account> accounts;


    public Client() {
    }

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        /*String[] names = {"Eugene", "Thomas", "Dave", "William", "Robert", "Nancy", "Mary", "Ann", "Seth"};
        String[] surnames = {"Bolt", "Gale", "Wayne", "Shaun", "Dope", "Cope", "Plan", "Bush"};




        ClientDaoImpl i = new ClientDaoImpl();
        Random random = new Random();


        for (int j = 0; j < 10; j++) {
            for (String name : names) {
                i.create(new Client(name, surnames[random.nextInt(surnames.length)]));
            }
        }
*/

        ClientDaoImpl impl = new ClientDaoImpl();

        Account a = new Account(300);
        impl.getById(1).addAccount(a);




        impl.destroy();
    }

    public long getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "entity.Client №" + ID +
                ": " + firstName + " " + lastName;
    }


    public void addAccount(Account account) {
        accounts.add(account);
    }
}