package program;

import java.util.concurrent.atomic.AtomicLong;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreeterController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    GreeterService greeterService;

    @Autowired
    GreeterController(GreeterService greeterService){
        this.greeterService = greeterService;
    }

    @RequestMapping("/greeter")
    public Greeter greeter(@RequestParam(defaultValue="0") String iban, @RequestParam(defaultValue="0") String balance, @RequestParam(defaultValue="John Doe") String holder) {
        return new Greeter(counter.incrementAndGet(), iban, balance, holder);
    }

    @GetMapping("/greeter/{holder}")
    public List<Greeter> findAccountByHolder(@PathVariable String holder){
        System.out.println("Searching by name: " + holder);
        return greeterService.findAccountByHolder(holder);
    }

    @GetMapping("/greeter/getall")
    public List<Greeter> getAllGreeters(){
        return greeterService.findAll();
    }
}