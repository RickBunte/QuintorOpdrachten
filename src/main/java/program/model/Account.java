package program.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Embeddable;

@Entity
@Embeddable
public class Account{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    private String address;


    public Account(long id, String username, String password, String address){
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public long getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getAddress() {
        return address;
    }

}