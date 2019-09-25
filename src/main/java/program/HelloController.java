package Program;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController{

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }

    /*public static void commandLineRunner2()
    {
        return args ->{
            System.out.println("Enter string to reverse:");

            Scanner read = new Scanner(System.in);
            String str = read.nextLine();

            StringBuilder sb = new StringBuilder();

            for(int i = str.length() - 1; i >= 0; i--)
            {
                sb.append(str.charAt(i));
            }

            System.out.println("Reversed string is:");
            System.out.println(sb.toString());
        };
    }*/
}