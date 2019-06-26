package com.qglt.test.interceptor;

import com.qglt.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by qingt on 2019/6/25.
 */
public class TestInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==========");
        Integer userId = Integer.valueOf(request.getParameter("userId"));
        System.out.println(userId);
        System.out.println("==========");
        if (null != userService.queryUserById(userId)){
            return true;
        }
        return false;
    }
}
