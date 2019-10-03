package program.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Embedded;

@Entity
public class Employee{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String position;
    @Embedded
    private Account account;

    protected Employee(){}

    public Employee(long id, String firstName, String lastName, String position, Account account){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.account = account;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public Account getAccount() {
        return account;
    }
}