package program.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        /*accountView view = new accountView();
        account program.model = new account();
        accountController controller = new accountController(program.model, view);

        view.setVisible(true);*/
    }


}
