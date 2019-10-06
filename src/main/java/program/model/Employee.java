package program.model;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE", schema = "RECORDS")
public class Employee{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name="position", nullable = false)
    private String position;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Account_Id", nullable = false)
    private Account accountId;

    protected Employee(){}

    public Employee(long id, String position, Account accountId){
        this.id = id;
        this.position = position;
        this.accountId = accountId;
    }

    public long getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public Account getAccount() {
        return accountId;
    }
}