package program.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class combiAccountModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String accountNumber;
    private long balance;
    private String iban;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "linked_accounts", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    accountModel linkedAccounts;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public accountModel getLinkedAccounts() {
        return linkedAccounts;
    }

    public void setLinkedAccounts(accountModel linkedAccounts) {
        this.linkedAccounts = linkedAccounts;
    }
}
