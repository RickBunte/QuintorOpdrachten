package program.model;

import javax.persistence.*;

enum Gender{
    MALE,
    FEMALE
}

@Entity
@Table(name="CUSTOMER", schema = "RECORDS")
public class Customer{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name="Gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Account_Id", nullable = false)
    private Account accountId;
    @Embedded
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private Address address;

    /*@Override
    public String toString() {
        return String.format(
                "Customer[id=%d, gender=%d, accountid=%d]",
                id, gender, accountId);
    }*/

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public Gender getGender(){
        return gender;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId){
        this.accountId = accountId;
    }

    public Address getAddress(){
        return this.address;
    }
}