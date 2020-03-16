package loveandpeace;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/anno")
@SessionAttributes("msg") // 把msg=cool这个从request存进session域
public class AnnoController {

    //测试requestparam注释
    @RequestMapping("/requestParam")
    public String fuck(@RequestParam(name = "username")String name){
        System.out.println("执行了");
        System.out.println(name);
        return "success";
    }

    //测试请求体注释
    @RequestMapping(value = "/testRequestBody",produces="application/json; charset=utf-8")
    public String testRequestBody(@RequestBody String body) throws UnsupportedEncodingException {
        System.out.println("执行了");
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/pathvar/{sid}")
    public String testPathVar(@PathVariable(name = "sid")String id){
        System.out.println("执行了");
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/sessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("执行了");
        model.addAttribute("msg","cool");
        return "success";
    }

    @RequestMapping("/getsessionAttributes")
    public String getSessionAttributes(ModelMap m){
        System.out.println("执行了");
        String s = (String)m.get("msg");
        System.out.println(s);
        return "success";
    }

    @RequestMapping("/deleteSessionAttributes")
    public String deleteSessionAttributes(SessionStatus status){
        System.out.println("执行了");
        status.setComplete();
        return "success";
    }
}