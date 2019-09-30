package program.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee{
    @Id
    @GenerateValue(strategy=GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String position;
    @Embedded
    private Account account;

    protected Employee(){}

    public Employee employee(long id, String firstName, String lastName, String position, Account account){
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

    public long getPosition() {
        return position;
    }

    public Account getAccount() {
        return account;
    }
}