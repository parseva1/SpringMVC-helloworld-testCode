package loveandpeace.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//自定义拦截器
public class testInterceptor implements HandlerInterceptor {
    @Override
    // 返回值true放行，false不放行下一个拦截器或controller
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println("拦截器执行啦乌啦啦啦啦！");
        return true;
    }
}
