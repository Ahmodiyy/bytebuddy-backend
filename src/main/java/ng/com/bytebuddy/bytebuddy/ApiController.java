package ng.com.bytebuddy.bytebuddy;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @GetMapping(value = "/welcome" )
    public String welcome(){
        return"opeyemi";
    }

}

