package program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@CacheConfig(cacheNames={"greeter"})
public class GreeterService {
    private List<Greeter> accounts = new ArrayList<>();

    @Autowired
    GreeterService() {}

    @Cacheable
    @PostConstruct
    private void fillAccounts(){
        accounts.add(new Greeter(1, "INGB1", "2000", "Simon"));
        accounts.add(new Greeter(2, "INGB2", "4000", "Simon"));
        accounts.add(new Greeter(3, "INGB3", "15", "Rick"));
        accounts.add(new Greeter(4, "INGB4", "50000", "George"));
        accounts.add(new Greeter(5, "INGB5", "5", "John"));
    }

    @Cacheable
    public List<Greeter> findAll(){
        simulateSlowService();
        return this.accounts;
    }

    @Cacheable
    public List<Greeter> findAccountByHolder(String holder){
        simulateSlowService();
        List<Greeter> listOfAccountsOfHolder = accounts.stream().filter(c -> c.getHolder() == holder).collect(Collectors.toList());
        return listOfAccountsOfHolder;
        /*if(holder.contains("%20")){
            System.out.println("Space found!");
        }
        if(accounts.contains(holder)){

        }
        else{
            System.out.println("There's no such account holder!");
            return null;
        }*/
    }


    public void simulateSlowService(){
        try{
            System.out.println("Going to sleep for 5 seconds to simulate backend.");
            Thread.sleep(1000*3);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
