package com.stone.javaweb;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class HelloServletContextListner implements ServletContextListener, HttpSessionListener, ServletRequestListener {

    public HelloServletContextListner() {
        
    }
    
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("ServletContext对象被创建" + sce.getServletContext());
    }	

    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("ServletContext对象被销毁" + sce.getServletContext());
    }

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("ServletRequest被销毁");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("ServletRequest被创建");
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("HttpSession被创建");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("HttpSession被销毁");
	}
}