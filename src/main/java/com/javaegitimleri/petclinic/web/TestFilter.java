package com.javaegitimleri.petclinic.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/TestServlet")
public class TestFilter implements Filter {
    public TestFilter(){

    }

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        response.getWriter().write("before...");
        chain.doFilter(request, response);
        response.getWriter().write("after...");
    }

    public void init(FilterConfig fConfig) throws ServletException {

    }

}