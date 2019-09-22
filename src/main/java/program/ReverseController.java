package Program;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController extends ReverserAndCounter{
    private static final String template = "The word is: ";
    private static final String template2 = "The reverse is: %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/reverse")
    public String reverse(@RequestParam(value="word", defaultValue="blank") String word){
        /*return new Reverse(counter.incrementAndGet(),
                String.format(template, reverser(word)));*/
        return template + reverser(word) + " which is " + wordCounter(word) + " numbers long!";
    }

}