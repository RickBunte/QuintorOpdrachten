package Program;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController{
    private static final String template = "The word is: %s!";
    private static final String template2 = "The reverse is: %s!";
    private final AtomicLong counter = new AtomicLong();
    String reverse = "";

    @RequestMapping("/reverse")
    public Reverse reverse(@RequestParam(value="word", defaultValue="blank") String word){
        for(int i = word.length() - 1; i >= 0; i--)
        {
            reverse = reverse + word.charAt(i);
        }
        return new Reverse(counter.incrementAndGet(),
                String.format(template, word));
    }
}