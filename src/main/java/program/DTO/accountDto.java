package program.DTO;

import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class accountDto {
    private long id;
    private long accountNumber;
    private long balance;
    private String iban;

    //GETTERS AND SETTERS
    public long getId(){
        return this.id;
    }

    public void setId(long _id){
        this.id = _id;
    }

    public void setAccountNumber(long _accountNumber){
        this.accountNumber = _accountNumber;
    }

    public long getBalance(){
        return this.balance;
    }

    public void setBalance(long _balance){
        this.balance = _balance;
    }

    public String getIban(){
        return this.iban;
    }

    public void setIban(String _iban){
        this.iban = _iban;
    }


}
