package Servlet;

import javax.servlet.*;
import java.io.IOException;

public class AServlet implements Servlet {
    //生命周期方法
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init()......");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("ServletConfig()......");
        return null;
    }

    //生命周期方法
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service()......");
    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo()......");
        return "我是一个快乐的Servlet";
    }

    //生命周期方法
    @Override
    public void destroy() {
        System.out.println("destroy()......");
    }
}
