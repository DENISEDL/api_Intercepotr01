package com.example.api_interceptor01.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class APILoggingInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       String userAgent = request.getHeader("User-Agent");
       System.out.println("User-Agent :" + userAgent);
       return true;
    }
    @Override
    public void postHandle(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, java.lang.Object handler, @org.springframework.lang.Nullable org.springframework.web.servlet.ModelAndView modelAndView) throws Exception {}
    @Override
    public void afterCompletion(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, java.lang.Object handler, @org.springframework.lang.Nullable java.lang.Exception ex) throws Exception {}

}
