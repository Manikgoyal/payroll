/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.techdazzler.config;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author manik
 */
public class Initializer implements WebApplicationInitializer{

    public void onStartup(ServletContext sc) throws ServletException {
    	System.out.println("hello inside");
        AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
        ctx.register(AppConfig.class);
        sc.addListener(new ContextLoaderListener(ctx));
        ctx.setServletContext(sc);
        Dynamic servlet=sc.addServlet("dispatcher", new DispatcherServlet(ctx));
        servlet.addMapping("/");
	servlet.setLoadOnStartup(1);
    }
    
}
