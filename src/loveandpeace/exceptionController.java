package loveandpeace;

import loveandpeace.exception.wowException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exception")
public class exceptionController {
    @RequestMapping("/test")
    public String test() throws Exception {
        System.out.println("muamua");
        // 模拟异常
        try {
            int a = 10/0;
        }catch (Exception e){
            e.printStackTrace();
            // 抛出自定义异常信息
            throw new wowException("噢！你遇上了一个错误OAO...");
        }
        return "success";
    }
}
