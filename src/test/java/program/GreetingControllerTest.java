package program;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingControllerTest {

    private GreetingController greetingController = new GreetingController();

    @Test
    public void greeterIndex() {
        assertThat(greetingController.index(), containsString("Greetings from Spring Boot!"));
    }

}