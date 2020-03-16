package loveandpeace;

import loveandpeace.bean.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class userController {

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("执行了");
        user u = new user();
        u.setUname("严城");
        u.setPsw("123");
        Date date = new Date(2015-03-19);
        String d = new SimpleDateFormat("yyyy-MM-dd").format(date);
        u.setDate(d);
        model.addAttribute("user",u);
        return "success";
    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("执行了");
        // 转发访问
        // request.getRequestDispatcher("/WEB-INF/view/success.jsp").forward(request,response);

        // 重定向是新请求不能直接访问web-inf里受保护的jsp网址，需要做xml配置权限
        // 所以这里重定向访问外部index.jsp
        // request.getContextPath()是项目名字
        response.sendRedirect(request.getContextPath()+"/index.jsp");

        // 字节流输出
        // response.setCharacterEncoding("utf-8");
        // 设置浏览器解析编码
        // response.setContentType("text/html;charset=utf-8");
        // response.getWriter().print("fuckyou!---XD你好");
        return;
    }

    // 返回ModelAndView对象
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView m = new ModelAndView();
        System.out.println("执行了！");
        user u = new user();
        u.setUname("小小");
        u.setPsw("1277");
        //当前时间
        Date date = new Date();
        String d = new SimpleDateFormat("yyyy-MM-dd").format(date);
        u.setDate(d);
        // 存对象
        m.addObject("user",u);
        m.setViewName("success");
        return m;
    }

    // 关键字的转发重定向
    @RequestMapping("/testForwardOrRedirect")
    public String ForwardOrRedirect(){
        System.out.println("执行了");
        // 请求的转发
        // return "forward:/WEB-INF/view/success.jsp";
        // 请求的重定向
        return "redirect:/index.jsp";
    }

    // ajax响应JSON
    @RequestMapping("/testAjax")
    public @ResponseBody user testAjax(@RequestBody user user){
        System.out.println("执行了");
        user.setUname("我日！");
        user.setPsw("牛逼！");
        return user;
    }
}
