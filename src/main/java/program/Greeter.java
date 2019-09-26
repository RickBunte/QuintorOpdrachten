package program;

public class Greeter{
    private long id;
    private String iban;
    private String balance;
    private String holder;

    public Greeter(long id, String iban, String balance, String holder){
        super();
        this.id = id;
        this.iban = iban;
        this.balance = balance;
        this.holder = holder;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getIban(){ return iban;}

    public void setIban(String iban){
        this.iban = iban;
    }

    public String getBalance(){ return balance;}

    public void setBalance(String balance){
        this.balance = balance;
    }

    public String getHolder(){ return holder; }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public String sayHello(){
        return "Hey";
    }
}