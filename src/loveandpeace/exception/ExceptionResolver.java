package loveandpeace.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExceptionResolver implements HandlerExceptionResolver {

    @Override
    // 处理异常业务逻辑
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        wowException ex = null;
        if (e instanceof wowException){
            ex = (wowException)e;
        }else {
            e = new wowException("你发生报错啦！！请联系管理员qwq");
        }
        // 创建mav对象
        ModelAndView m = new ModelAndView();
        m.addObject("errorMsg",e.getMessage());
        m.setViewName("error");
        return m;
    }
}
