package com.study.studyspringboot.Interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: suxin
 * Date: 2019/7/2   Time: 10:04
 * Description:
 **/
public class MyInterceptor extends HandlerInterceptorAdapter {
    private final Logger logger = LoggerFactory.getLogger(MyInterceptor.class);

    @Override
    //在业务处理器处理请求之前被调用。
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("this is Interceptor");
        Map map =(Map)request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);

        if(checkAuth(map)) {
            return true;    //如果false，停止流程，api被拦截
        }else {
            PrintWriter printWriter = response.getWriter();
            printWriter.write("please login again!");
            return false;
        }
    }

    /**
     * 校验用户访问权限
     * @param userMap
     * @return
     */
    private boolean checkAuth(Map userMap){
        return true;
    }


    @Override
    //在业务处理器处理请求执行完成后，生成视图之前执行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {}

    @Override
    //在DispatcherServlet完全处理完请求后被调用，可用于清理资源等
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)throws Exception {}

}