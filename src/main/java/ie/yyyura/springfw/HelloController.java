package ie.yyyura.springfw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // which URL will bring to this Method of this Controller
    @GetMapping("/hello-world")
    public String sayHello(){
        // in this method we can
        // we can address(обращаться) to Model, get data from DB
        // show data to User
        // redirect to another page

        // but now just return View to the user (вернем пользователю представление )
        // это имя представления
        return "hello_world";
    }
}
