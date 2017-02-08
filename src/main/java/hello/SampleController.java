package hello;

/**
 * Created by elena on 12/15/16.
 */
import org.springframework.boot.*;
        import org.springframework.boot.autoconfigure.*;
        import org.springframework.stereotype.*;
        import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello Spring Boot!";
    }

    @RequestMapping("/test")
    @ResponseBody
    String test() {
        return "test Spring Boot";
    }



    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}