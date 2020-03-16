package loveandpeace;

import loveandpeace.bean.account;
import loveandpeace.bean.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/hi")
public class tryController {
    @RequestMapping("/say")// 测试自动对象绑定
    public String say(account account) {
        System.out.println(account);
        return "success";
    }

    @RequestMapping("/date")// 测试自定义类型转换器
    public String wow(user user) {
        System.out.println(user);
        return "success";
    }

    //获取servlet原生API
    @RequestMapping("/testServletAPI")
    public String qwq(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        ServletContext servletContext = session.getServletContext();
        System.out.println(session);
        System.out.println(request);
        System.out.println(servletContext);
        System.out.println(response);
        return "success";
    }
}
