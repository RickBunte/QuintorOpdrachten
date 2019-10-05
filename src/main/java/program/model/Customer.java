package program.model;

import javax.persistence.*;

enum Gender{
    MALE,
    FEMALE
}

@Entity
public class Customer{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Column(name="firstName", nullable = false)
    private String firstName;
    @Column(name="lastName", nullable = false)
    private String lastName;

    //private Gender gender;
    //@Embedded
    //private Account accountId;

    protected Customer(){}

    public Customer(long id, String firstName, String lastName/*, Gender gender, Account account*/){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        //this.gender = gender;
        //this.account = account;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

    public long getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    /*public Gender getGender(){
        return gender;
    }

    public Account getAccount() {
        return account;
    }*/
}