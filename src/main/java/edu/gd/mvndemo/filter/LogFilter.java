package edu.gd.mvndemo.filter;

import javax.servlet.*;
import java.io.IOException;
import java.rmi.server.ServerCloneException;
import java.util.Date;

public class LogFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException{

    }

    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain){
        //添加日志
        String curDate=new Date().toString();
        String ip = request.getRemoteAddr();
        System.out.println(curDate+"ip:" + ip);

    }

    public void destroy(){

    }
}

