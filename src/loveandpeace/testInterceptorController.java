package loveandpeace;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/interceptor")
public class testInterceptorController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("执行了");
        return "success";
    }
}
