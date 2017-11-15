/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Oguzhan
 */
@WebFilter(filterName = "SessionFilter", urlPatterns = {"/*"})
public class SessionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       HttpServletRequest req1=(HttpServletRequest)request;
        HttpServletResponse res1=(HttpServletResponse)response;
        
        String sessionUser=(String)req1.getSession().getAttribute("userName");
        String currentPath=req1.getRequestURL().toString();
        
        if(sessionUser!=null){
            if(currentPath.contains("login.xhtml")){
                res1.sendRedirect(req1.getContextPath()+"/Admin/admin.xhtml");
            }else{
                chain.doFilter(request, response);
            }
        }else{
            if(currentPath.contains("Login")){
                res1.sendRedirect(req1.getContextPath()+"error.xhtml");
            }else{
                chain.doFilter(request, response);
            }
        }
    }

    @Override
    public void destroy() {
    }
    
    
}
